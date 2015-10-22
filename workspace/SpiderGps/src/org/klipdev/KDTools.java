package org.klipdev;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class KDTools {
    public static javax.swing.filechooser.FileFilter NewFileFilter(final String desc, final String[] allowed_extensions) {
        return new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(java.io.File f) {
                if (f.isDirectory()) {
                    return false;
                }
                int pos = f.getName().lastIndexOf('.');
                if (pos == -1) {
                    return false;
                } else {
                    String extension = f.getName().substring(pos + 1);
                    for (String allowed_extension : allowed_extensions) {
                        if (extension.equalsIgnoreCase(allowed_extension)) {
                            return true;
                        }
                    }
                    return false;
                }
            }

            @Override
            public String getDescription() {
                return desc;
            }
        };
    }
    /*
	public static javax.swing.filechooser.FileFilter NewFileFilter( String title, String filter ) {
		return new FileFilter() {
		    public String getDescription() {
		        return title;
		    }
		 
		    public boolean accept(File f) {
		        if (f.isDirectory()) {
		            return false;
		        } else {
		        	System.out.println(filter);
		        	System.out.println(f.getName() );
		        	
		            return f.getName().toLowerCase().endsWith(filter.toLowerCase());
		        }
		    }

		};
	}*/
}
