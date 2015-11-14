package org.klipdev.spidergps;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SGAboutPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3731770414268130528L;
	final String jxBrowserDisclaimer = "";
	
	public SGAboutPanel() {
		buildPanel();
	}
	
	void buildPanel() {
		add( new JLabel(jxBrowserDisclaimer), BorderLayout.NORTH );
	}
}
