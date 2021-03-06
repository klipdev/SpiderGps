package org.klipdev.spidergps;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


// TODO: different class for path and sections ?
public class SGTraceDescriptor implements Serializable {
	private static final long serialVersionUID = 3540369068093687501L;
	public static final int FILETYPE_TCX = 1;
	public static final int FILETYPE_GPX = 2;
	public static final int FILETYPE_KML = 3;
	public static final int FILETYPE_UNKNOWN = 9;

	String name;
	String filenameLong;
	String filenameShort;

	// tcx, kml, gpx...
	int fileType = FILETYPE_UNKNOWN;

	// TODO/1: add square obj for trace area
	// true to show trace on map
	Boolean showOnMap;
	
	// Unique ID to identify the descriptor. 0 = not set
	final private long uid;

	// date of track run or route creation
	LocalDateTime traceDate;

	SGPath path = null;

	protected SGTraceDescriptor(SGPath p) throws Exception {
		showOnMap     = false;
		
		filenameLong  = "section";
		filenameShort = "section";
		name          = p.name;

		fileType = FILETYPE_UNKNOWN;
		
		// Generate UID
		uid = UIDGen.nextId();
		
		// Import the file
		path = p;
	}

	protected SGTraceDescriptor(String filename) throws Exception {
		showOnMap    = false;
		filenameLong = filename;
		
		int index = filename.lastIndexOf(File.separatorChar);
		filenameShort = filename.substring(index+1);
		name = filenameShort;

		// Detect filetype from file
		fileType = detectFileType( filename );
		
		// Generate UID
		uid = UIDGen.nextId();
		
		traceDate = readTimeFromFile();
		
		// Import the file
		path = new SGPath( "test", 1000 );
		parseFile();
		path.simplify();
	}
	
	final static SGTraceDescriptor NewTraceDescriptor( SGPath p ) throws Exception {
		SGTraceDescriptor td = null;
		td = new SGTraceDescriptor(p);
		return td;
	}

	final static SGTraceDescriptor NewTraceDescriptor( String filename ) throws Exception {
		SGTraceDescriptor td = null;
		int type = SGTraceDescriptor.detectFileType(filename);
		switch ( type ) {
		case  FILETYPE_TCX:
			td = new SGTraceDescriptorTcx(filename);
			break;
		case FILETYPE_GPX:
		case FILETYPE_KML:
		case FILETYPE_UNKNOWN:
			td = null;
			throw new Exception( "Unknown file type !" );
		}
		return td;
	}

	final static int detectFileType( String filename ) throws Exception {
		String extension = "";

		int i = filename.lastIndexOf('.');
		int p = Math.max(filename.lastIndexOf('/'), filename.lastIndexOf('\\'));

		if (i > p) {
		    extension = filename.substring(i+1);
		    
		    if ( "tcx".equalsIgnoreCase(extension)) {
		    	return FILETYPE_TCX;
		    } else if ( "gpx".equalsIgnoreCase(extension)) {
		    	return FILETYPE_GPX;
		    } else if ( "kml".equalsIgnoreCase(extension)) {
		    	return FILETYPE_KML;
		    } else {
		    	// TODO: throw error
		    	throw( new Exception( "Unknown filetype: " + extension ) );
		    }
		} else {
	    	throw( new Exception( "Unknown filetype (not a file?)" ) );
		}
	}
	
	long getUID() {
		return uid;
	}
	
	LocalDateTime readTimeFromFile() {
		// TODO: get date/time from file
		return LocalDateTime.now();
	}
	
	int getType() {
		return fileType;
	}

	protected void parseFile() {
		return;
	}
	
	private  void writeObject(ObjectOutputStream oos)
	throws IOException {
		oos.writeUTF( name );
		oos.writeUTF( filenameLong );
		oos.writeUTF( filenameShort );
		oos.writeBoolean(showOnMap);
		oos.writeObject(traceDate);
		oos.writeObject( path );
	}

	private  void readObject(ObjectInputStream ois)
	throws IOException, ClassNotFoundException {
		name = ois.readUTF();
		filenameLong = ois.readUTF();
		filenameShort = ois.readUTF();
		showOnMap = ois.readBoolean();
		traceDate = (LocalDateTime) ois.readObject();
		path = (SGPath) ois.readObject();
	}
}
