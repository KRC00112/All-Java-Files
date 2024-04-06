package lec46_FileClass;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		// file = An abstract representation of file and directory path names
		
		
		File file=new File("rev_test.txt");
		
		if(file.exists()) {
			System.out.println("That file exists.");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("That file does not exist");
		}
		
		
	}

}
