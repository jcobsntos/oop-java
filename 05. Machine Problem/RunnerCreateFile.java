package week16;

import java.io.File;

public class RunnerCreateFile {

	public static void main(String[] args) {
		MachineProblem mp = new MachineProblem();
		File directory = new File("C:\\Program Files (x86)\\Adobe");
		System.out.println("Path Inside Parent Directory \"Adobe\" to Sub-Directories \"Adobe Creative Cloud, " 
				+ " \nAdobe Creative Cloud Experience, and Adobe Sync\" to other sub-directories inside these sub-directories"
				+ "\nall in which each of these contains a file and is read recursively\n");
		mp.directoryToFileList(directory);
	}
}
