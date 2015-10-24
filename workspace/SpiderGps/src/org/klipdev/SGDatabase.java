package org.klipdev;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;

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

public class SGDatabase {
	SGTraceLib traceLib   = new SGTraceLib();
	SGTraceLib sectionLib = new SGTraceLib();
	
	public SGDatabase() {
		
	}
	

	public void addTrace( String filename ) throws Exception {
		SGTraceDescriptor td = SGTraceDescriptor.NewTraceDescriptor( filename );
		traceLib.addTrace(td);
	}
	
}
