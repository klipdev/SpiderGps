package org.klipdev.spidergps;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SGAboutPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3731770414268130528L;
	final String jxBrowserDisclaimer = "SpiderGps uses JxBrowser http://www.teamdev.com/jxbrowser, which is a proprietary software. The use of JxBrowser is governed by JxBrowser Product Licence Agreement http://www.teamdev.com/jxbrowser-licence-agreement. If you would like to use JxBrowser in your development, please contact TeamDev.";
	
	public SGAboutPanel() {
		buildPanel();
	}
	
	void buildPanel() {
		add( new JLabel(jxBrowserDisclaimer), BorderLayout.NORTH );
	}
}
