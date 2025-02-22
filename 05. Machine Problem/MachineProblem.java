package week16;

import java.io.File;

public class MachineProblem {

	public void directoryToFileList(File directory) {
		File[] fileListsFiles = directory.listFiles();
		for (File file : fileListsFiles) {
			if(file.isFile()) {
				System.out.println(file.getAbsolutePath());
			} 
			else if(file.isDirectory()) {
				directoryToFileList(file.getAbsoluteFile());
			}
		}
	}
}
