package org.klipdev;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.klipdev.tcx.ActivityLapT;
import org.klipdev.tcx.ActivityListT;
import org.klipdev.tcx.ActivityT;
import org.klipdev.tcx.HeartRateInBeatsPerMinuteT;
import org.klipdev.tcx.PositionT;
import org.klipdev.tcx.SportT;
import org.klipdev.tcx.TrackT;
import org.klipdev.tcx.TrackpointT;
import org.klipdev.tcx.TrainingCenterDatabaseT;

public class SGTraceDescriptorTcx extends SGTraceDescriptor {
	SGTraceDescriptorTcx( String filename ) throws Exception {
		super( filename );
		fileType = FILETYPE_TCX;		
	}

	@Override
	protected void parseFile() {
		path.reset();

		JAXBContext jc;
		try {
    		SGPath path = new SGPath(filenameLong, 1000 );

			jc = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
			Unmarshaller u = jc.createUnmarshaller();
			JAXBElement doc = (JAXBElement) u.unmarshal(new FileInputStream(filenameLong));
			TrainingCenterDatabaseT tcdb = (TrainingCenterDatabaseT) doc.getValue();
			
			ActivityListT activityList = tcdb.getActivities();
			List<ActivityT> activityL = activityList.getActivity();
			for (ActivityT activity : activityL) {
				SportT sport = activity.getSport();
				SGTools.Log1(this, "Sport " + sport);
				List<ActivityLapT> laps = activity.getLap();
				for (ActivityLapT lap : laps) {
 
					List<TrackT> tracks = lap.getTrack();
 
					for (TrackT track : tracks) {
						List<TrackpointT> trackPoints = track.getTrackpoint();
						for (TrackpointT trackPoint : trackPoints) {
							SGTools.Log1(this, "Time " + trackPoint.getTime() );
							SGTools.Log1(this, "  Cadence " + trackPoint.getCadence());
							HeartRateInBeatsPerMinuteT hr = trackPoint.getHeartRateBpm();
							if ( hr != null ) {
								SGTools.Log1(this, "  Heart Rate " + hr.getValue());
							}
							
							
							// POPULATE GPPath OBJECT
							/////////////////////////
							PositionT pos = trackPoint.getPosition();
							if ( pos != null ) {
								path.addPosition(pos.getLatitudeDegrees(), pos.getLongitudeDegrees(), trackPoint.getAltitudeMeters());
								//js.concat( String.format("[%f, %f],", pos.getLatitudeDegrees(), pos.getLongitudeDegrees()) );
								//String ss = String.format("[%f, %f],", pos.getLatitudeDegrees(), pos.getLongitudeDegrees());
								//js = js + ss;
								//System.out.println( ss );
//								js = js + String.format(Locale.ENGLISH, "[%f, %f],", pos.getLatitudeDegrees(), pos.getLongitudeDegrees());
							}
/*
							// <Extensions><TPX xmlns="http://www.garmin.com/xmlschemas/ActivityExtension/v2"><Watts>60</Watts></TPX></Extensions>
							ExtensionsT ext = trackPoint.getExtensions();
							List extensions = ext.getAny();
							for (Object o : extensions) {
								Node n = (Node) o;
								if ("watts".equalsIgnoreCase(n.getFirstChild().getNodeName())) {
 
								System.out.println("  Power " + n.getTextContent() + " watts");
								}
 
							}
*/
						}
					}
 
				}
			}
			SGTools.Log1(this, path.getStatsAsString());
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
