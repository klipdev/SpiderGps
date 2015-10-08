package org.klipdev;

import javax.swing.table.AbstractTableModel;

public class TracesTableModel extends AbstractTableModel {
	
	Object rowData[][] = { { Boolean.TRUE, "1", "01-sep-2015" }, { Boolean.TRUE, "2", "01-sep-2015" }, { Boolean.FALSE, "3", "01-sep-2015" }, { Boolean.TRUE, "4", "01-sep-2015" }, { Boolean.FALSE, "5", "01-sep-2015" } };
	String columnNames[] = { "View", "Filename", "Date" };

	public Class getColumnClass(int column) {
	    return (getValueAt(0, column).getClass());
    }

	@Override
	public int getRowCount() {
		return rowData.length;
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
		return rowData[rowIndex][columnIndex];
	}

	public void setValueAt(Object value, int row, int column) {
		  rowData[row][column] = value;
	}

	public boolean isCellEditable(int row, int column) {
		  return (column == 0);
	}
	  
}
