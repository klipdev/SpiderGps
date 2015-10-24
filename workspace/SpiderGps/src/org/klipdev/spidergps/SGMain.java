package org.klipdev.spidergps;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileFilter;


public class SGMain implements ActionListener {
	final Browser BROWSER = new Browser();
	
	final String MenuFileImportFiles = "Import files...";

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
		mainFrame.setSize(900, 500);
		mainFrame.setLocationRelativeTo(null);
		
		mainFrame.setJMenuBar( buildMenuBar() );
		mainFrame.setVisible(true);
		
		// TODO: find how to open html file from the package
//		browser.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/gmaps.html");
//		browser.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/web/testleaflet.html");
		BROWSER.loadURL("http://www.google.com");
		BROWSER.reload();
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

		//Build the first menu.
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);

		//a group of JMenuItems
		menuItem = new JMenuItem(MenuFileImportFiles);
		menuItem.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setMultiSelectionEnabled(true);
				FileFilter ff = KDTools.NewFileFilter("GPS Files (.gpx, .kml, .tcx)", new String[] { "gpx", "kml", "tcx" } );
				chooser.addChoosableFileFilter( ff );
				chooser.setFileFilter(ff);
				chooser.showOpenDialog(mainFrame);
				File[] files = chooser.getSelectedFiles();
		        for (File file : files) {
		        	 SGTools.Log1( this, file.getPath() );
		        	 try {
						tableModel.addFile(file.getPath());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		             //String path = file.getPath().replace('\\', '/');
		             //System.out.println(path);
		        }
			}
		});
		menu.add(menuItem);

		//menuItem = new JMenuItem("Import folder...");
		//menuItem.addActionListener(this);
		//menu.add(menuItem);
		
		return menuBar;
	}
	
	JPanel buildTablePanel() {
	    tableModel = new TracesTableModel();
	    JTable table = new JTable(tableModel);
	    JScrollPane scrollPane = new JScrollPane(table);

	    JPanel tablePanel = new JPanel(new BorderLayout());
	    tablePanel.add(scrollPane);

	    return tablePanel;
	}

	JPanel buildTestPanel() {
		// TST: panel pour tests uniquement
		JPanel p = new JPanel();

		JButton b = new JButton("parse tcx");
		p.add(b);

		JButton rld = new JButton("reload gmaps");
		p.add(rld);

		JButton leaf = new JButton("reload leaflet");
		p.add(leaf);

		rld.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BROWSER.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/gmaps.html");
				//browser.reloadIgnoringCache();
				mapLabel.setText(BROWSER.getURL());
			}
		});

		leaf.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BROWSER.loadURL("file:///Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/web/testleaflet.html");
				//browser.reloadIgnoringCache();
				mapLabel.setText(BROWSER.getURL());
			}
		});

// TODO: test simplify.js to reduce size of data
/*
		var polygon = L.polygon([
		                         [51.509, -0.08],
		                         [51.503, -0.06],
		                         [51.51, -0.047]
		                     ]).addTo(map);
*/
		b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		/*
	    		JAXBContext jc;
				try {
		    		String js = new String("addSection( 'lkj', [");
		    		
		    		SGPath path = new SGPath("/Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/miniere.tcx", 1000 );
					
					jc = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
					Unmarshaller u = jc.createUnmarshaller();
					JAXBElement doc = (JAXBElement) u.unmarshal(new FileInputStream("/Users/Christophe/Documents/Dev/SpiderGps/workspace/SpiderGps/src/miniere.tcx"));
					TrainingCenterDatabaseT tcdb = (TrainingCenterDatabaseT) doc.getValue();
					
					ActivityListT activityList = tcdb.getActivities();
					List<ActivityT> activityL = activityList.getActivity();
					for (ActivityT activity : activityL) {
						SportT sport = activity.getSport();
						System.out.println("Sport " + sport);
						List<ActivityLapT> laps = activity.getLap();
						for (ActivityLapT lap : laps) {
		 
							List<TrackT> tracks = lap.getTrack();
		 
							for (TrackT track : tracks) {
								List<TrackpointT> trackPoints = track.getTrackpoint();
								for (TrackpointT trackPoint : trackPoints) {
									System.out.println("Time " + trackPoint.getTime());
									System.out.println("  Cadence " + trackPoint.getCadence());
									HeartRateInBeatsPerMinuteT hr = trackPoint.getHeartRateBpm();
									if ( hr != null ) {
										System.out.println("  Heart Rate " + hr.getValue());
									}
									
									
									// CREATE GPPath OBJECT
									/////////////////////////
									PositionT pos = trackPoint.getPosition();
									if ( pos != null ) {
										path.addPosition(pos.getLatitudeDegrees(), pos.getLongitudeDegrees(), trackPoint.getAltitudeMeters());
										//js.concat( String.format("[%f, %f],", pos.getLatitudeDegrees(), pos.getLongitudeDegrees()) );
										//String ss = String.format("[%f, %f],", pos.getLatitudeDegrees(), pos.getLongitudeDegrees());
										//js = js + ss;
										//System.out.println( ss );
										js = js + String.format(Locale.ENGLISH, "[%f, %f],", pos.getLatitudeDegrees(), pos.getLongitudeDegrees());
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
*
								}
							}
		 
						}
					}
					System.out.println( path.getStatsAsString());
					js = js + "]);";

					System.out.println(js);
					BROWSER.executeJavaScript(js);
				} catch (JAXBException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
			}
	     });
	     
		return p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Selected: " + e.getActionCommand());
		if ( MenuFileImportFiles.equals(e.getActionCommand())) {
			JFileChooser chooser = new JFileChooser();
			chooser.setMultiSelectionEnabled(true);
			FileFilter ff = KDTools.NewFileFilter("GPS Files (.gpx, .kml, .tcx)", new String[] { "gpx", "kml", "tcx" } );
			chooser.addChoosableFileFilter( ff );
			chooser.setFileFilter(ff);
			chooser.showOpenDialog(mainFrame);
			File[] files = chooser.getSelectedFiles();
	        for (File file : files) {
	        	 System.out.println(file.getPath());
	             //String path = file.getPath().replace('\\', '/');
	             //System.out.println(path);
	        }
		}
	}
}
