package projectCK.core;

import java.io.File;
import java.io.FileFilter;

public class SuffixFileFilter implements FileFilter {

	private final String suffix;

	public SuffixFileFilter(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File f) {
		if (f.isDirectory()) {
			return false;
		} else {
			return f.isFile() && f.getName().endsWith("." + suffix);
		}
	}

}
