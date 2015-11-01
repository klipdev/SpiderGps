package org.klipdev.spidergps;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TracesTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	
	final private int COL_VIEW = 0;
	final private int COL_NAME = 1;
	final private int COL_DATE = 2;
	
	ArrayList<SGTraceDescriptor> traces;

	String columnNames[] = { "View", "Filename", "Date" };

	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	
	TracesTableModel( ArrayList<SGTraceDescriptor> tda ) {
		traces = tda;
	}
	
/*
	void addFile( String filename ) throws Exception {
		db.addTrace(filename);
		this.fireTableDataChanged();
	}
*/
	
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------

	public Class getColumnClass(int column) {
	    return (getValueAt(0, column).getClass());
    }

	@Override
	public int getRowCount() {
		return traces.size();
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
		SGTraceDescriptor td = traces.get(rowIndex);
		if ( columnIndex == COL_VIEW ) {
			return td.showOnMap;
		} else if ( columnIndex == COL_NAME ) {
			return td.name;
		} else if ( columnIndex == COL_DATE ) {
			return "date";
		}
		return null;
	}

	public void setValueAt(Object value, int row, int column) {
		if ( column == COL_VIEW ) {
			SGTraceDescriptor td = traces.get( row );
			td.showOnMap = (Boolean) value;
			fireTableRowsUpdated(row, row);
		}
	}

	public boolean isCellEditable(int row, int column) {
		  return (column == COL_VIEW);
	}
	  
}
