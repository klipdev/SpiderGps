package org.klipdev.spidergps;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileFilter;


public class SGMain implements ActionListener, TableModelListener {
	final Browser BROWSER = new Browser();

	// THE database ;)
	SGDatabase db = new SGDatabase();

	final String MenuFileImportFiles = "Import files...";
	final String MenuFileSave = "Save";
	final String MenuFileSaveAs = "Save As...";
	final String MenuHelpAbout = "About";
	
	final String jxBrowserDisclaimer = "SpiderGps uses JxBrowser http://www.teamdev.com/jxbrowser, which is a proprietary software.\nThe use of JxBrowser is governed by JxBrowser Product Licence Agreement http://www.teamdev.com/jxbrowser-licence-agreement.\nIf you would like to use JxBrowser in your development, please contact TeamDev.";

	JFrame mainFrame;
	JLabel mapLabel;
	TracesTableModel tableModel;

	SGMain() {
	}

	void buildGUI() {
		//browser = new Browser();
		BrowserView browserView = new BrowserView(BROWSER);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(buildTablePanel(), BorderLayout.WEST);

		JPanel mapPanel = new JPanel( new BorderLayout() );
		mapPanel.add( mapLabel = new JLabel("aa"), BorderLayout.NORTH );
		mapPanel.add(browserView, BorderLayout.CENTER);

		mainPanel.add( mapPanel, BorderLayout.CENTER );

		//mainPanel.add(browserView, BorderLayout.CENTER);
		mainPanel.add(buildTestPanel(), BorderLayout.SOUTH);
		
		   
		mainFrame = new JFrame("SpiderGps");
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.add( mainPanel );
		mainFrame.setSize(1200, 800);
		mainFrame.setLocationRelativeTo(null);
		
		mainFrame.setJMenuBar( buildMenuBar() );
		mainFrame.setVisible(true);
		
		// TODO: find how to open html file from the package
//		BROWSER.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/gmaps.html");
		BROWSER.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/web/testleaflet.html");
//		BROWSER.loadURL("http://www.google.com");
		mapLabel.setText(BROWSER.getURL());
	}
	
	
/*
 ****************************************************************************** 
 */
	JMenuBar buildMenuBar() {
		JMenuBar menuBar;
		JMenu menu, submenu;
		JMenuItem menuItem;

		//Create the menu bar.
		menuBar = new JMenuBar();

		// File Menu
		//-----------
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);

		// Save
		menuItem = new JMenuItem(MenuFileSave);
		menuItem.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( db.dbFilename.isEmpty() ) {
					JFileChooser chooser = new JFileChooser();
	// TODO: handle default folder from properties
	//				chooser.setCurrentDirectory(new File("/Users/Christophe/Documents/Loisirs/VTT/Historique/2015"));
					chooser.setMultiSelectionEnabled(false);
					FileFilter ff = KDTools.NewFileFilter("SpiderGPS File (.sgd)", new String[] { "sgd" } );
					chooser.addChoosableFileFilter( ff );
					chooser.setFileFilter(ff);
					chooser.showSaveDialog(mainFrame);
					
					File f = chooser.getSelectedFile();
					if ( f.exists() ) {
						JOptionPane.showMessageDialog(null,"Overwrite existing file ?","Spider GPS",JOptionPane.YES_NO_OPTION);
						int resp = JOptionPane.showConfirmDialog(null, "Overwrite existing file ?" );
						if ( resp != JOptionPane.YES_OPTION ) {
							return;
						}
					}
					
					db.saveAs( f.getAbsolutePath() );
					return;
				}

				// Save the file !
				db.save();
			}
		});
		menu.add(menuItem);

		// Save as
		menuItem = new JMenuItem(MenuFileSaveAs);
		menu.add(menuItem);

		// Import
		menuItem = new JMenuItem(MenuFileImportFiles);
		menuItem.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
// TODO: handle default folder from properties
//				chooser.setCurrentDirectory(new File("/Users/Christophe/Documents/Loisirs/VTT/Historique/2015"));
				chooser.setMultiSelectionEnabled(true);
				FileFilter ff = KDTools.NewFileFilter("GPS Files (.gpx, .kml, .tcx)", new String[] { "gpx", "kml", "tcx" } );
				chooser.addChoosableFileFilter( ff );
				chooser.setFileFilter(ff);
				chooser.showOpenDialog(mainFrame);
				File[] files = chooser.getSelectedFiles();
		        for (File file : files) {
		        	 SGTools.Log1( this, file.getPath() );
		        	 try {
						db.addTrace(file.getPath());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		             //String path = file.getPath().replace('\\', '/');
		             //System.out.println(path);
		        }
		        tableModel.fireTableDataChanged();
			}
		});
		menu.add(menuItem);

		
		// Help Menu
		//-----------
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_H);
		menuBar.add(menu);

   	 	menuItem = new JMenuItem(MenuHelpAbout);
		menuItem.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				YourJPanelForm stuff = new YourJPanelForm();
				JOptionPane.showMessageDialog(null,jxBrowserDisclaimer,"Spider GPS",JOptionPane.PLAIN_MESSAGE);
/*
				final JDialog frame = new JDialog( mainFrame, "SpiderGPS", true );
				frame.getContentPane().add( new SGAboutPanel() );
				frame.pack();
				frame.setVisible(true);
*/
			}
		} );
		menu.add(menuItem);
		
		//menuItem = new JMenuItem("Import folder...");
		//menuItem.addActionListener(this);
		//menu.add(menuItem);

		// TST
   	 	try {
//			db.addTrace("/Users/Christophe/0miniere.tcx");
			db.addTrace("/Users/Christophe/1testmerge.tcx");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
   	 	
   	 	return menuBar;
	}
	
	JPanel buildTablePanel() {
	    tableModel = new TracesTableModel( db.traceLib.traces );
	    JTable table = new JTable(tableModel);
	    tableModel.addTableModelListener(this);
	    
	    JScrollPane scrollPane = new JScrollPane(table);

	    JPanel tablePanel = new JPanel(new BorderLayout());
	    tablePanel.add(scrollPane);

	    return tablePanel;
	}

	JPanel buildTestPanel() {
		// TST: panel pour tests uniquement
		JPanel p = new JPanel();

		JButton b = new JButton("merge test");
		p.add(b);

		JButton rld = new JButton("reload gmaps");
		p.add(rld);

		JButton leaf = new JButton("reload leaflet");
		p.add(leaf);

		rld.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BROWSER.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/gmaps.html");
				//browser.reloadIgnoringCache();
				mapLabel.setText(BROWSER.getURL());
			}
		});

		leaf.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BROWSER.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/web/testleaflet.html");
				//browser.reloadIgnoringCache();
				mapLabel.setText(BROWSER.getURL());
			}
		});

		b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
////////////////////////////////////
////////////////////////////////////

	    		
	    		try {
					db.merge();
					tableModel.fireTableDataChanged();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		
////////////////////////////////////
////////////////////////////////////
			}
	     });
	     
		return p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Selected: " + e.getActionCommand());
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		if ( e.getType() == TableModelEvent.UPDATE ) {
			int row = e.getFirstRow();
			SGTraceDescriptor td = db.traceLib.traces.get(row);
			if ( td.showOnMap == true ) {
				String str = td.path.getJSStringAddSection();
				BROWSER.executeJavaScript(str);
			}
		}
	}
}
