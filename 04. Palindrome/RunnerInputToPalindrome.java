package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Writer;

public class RunnerInputToPalindrome {
	public static void main(String[] args) {
		FileReader fr = null;
		LineNumberReader lnr = null;
		StringBuffer sb = null;
		FileWriter fw = null;
		Writer w = null;
		try {
			fr = new FileReader("Files/input.txt");
			lnr = new LineNumberReader(fr);
			fw = new FileWriter("Files/palindrome.txt");
			w = new BufferedWriter(fw);
			System.out.println("Words that are palindrome from input.txt file");
			for (String line = lnr.readLine(); line != null; line = lnr.readLine()) {
				sb = new StringBuffer(line);
				sb.reverse();
				String s= sb.toString();
					if(line.equals(s)) {
						System.out.println( " - " + line);
						w.write(line);
						((BufferedWriter) w).newLine();
						w.flush();
						}
			}
			System.out.println("\nFile successfully written to palindrome.txt...");
			System.out.println("Above are Palindrome words that were selected to be written to palindrome.txt copied from input.txt");
			System.out.println("There are a total " + lnr.getLineNumber() + " inputs from input.txt file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				lnr.close();
				fw.close();
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
