package org.klipdev.spidergps;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

// Manages the list of traces
public class SGTraceLib implements Serializable {
	private static final long serialVersionUID = -3195450120949494029L;
	ArrayList<SGTraceDescriptor> traces;
	
	SGTraceLib() {
		traces = new ArrayList<SGTraceDescriptor>();
	};
	
	void addTrace( SGTraceDescriptor td ) {
		traces.add(td);
		
	}
	
	private  void writeObject(ObjectOutputStream oos)
	throws IOException {
		oos.writeObject( traces );
	}

	private  void readObject(ObjectInputStream ois)
	throws IOException, ClassNotFoundException {
		traces = (ArrayList<SGTraceDescriptor>) ois.readObject();
	}
}
