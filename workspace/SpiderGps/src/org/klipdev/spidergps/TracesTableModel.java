package org.klipdev.spidergps;

import javax.swing.table.AbstractTableModel;

public class TracesTableModel extends AbstractTableModel {
	final private int COL_VIEW = 0;
	final private int COL_NAME = 1;
	final private int COL_DATE = 2;
	
	SGDatabase db = new SGDatabase();
	SGTraceDescriptor traces[] = null;

	String columnNames[] = { "View", "Filename", "Date" };

	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	
	void addFile( String filename ) throws Exception {
		db.addTrace(filename);
		this.fireTableDataChanged();
	}
	
	
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------

	public Class getColumnClass(int column) {
	    return (getValueAt(0, column).getClass());
    }

	@Override
	public int getRowCount() {
//		return rowData.length;
		return db.traceLib.traces.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int column) {
		 return columnNames[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
//		return rowData[rowIndex][columnIndex];
		SGTraceDescriptor td = db.traceLib.traces.get(rowIndex);
		if ( columnIndex == COL_VIEW ) {
			return td.showOnMap;
		} else if ( columnIndex == COL_NAME ) {
			return td.filenameShort;
		} else if ( columnIndex == COL_DATE ) {
			return "date";
		}
		return null;
	}

	public void setValueAt(Object value, int row, int column) {
		if ( column == COL_VIEW ) {
			SGTraceDescriptor td = db.traceLib.traces.get( row );
			td.showOnMap = (Boolean) value;
		}
	}

	public boolean isCellEditable(int row, int column) {
		  return (column == COL_VIEW);
	}
	  
}
