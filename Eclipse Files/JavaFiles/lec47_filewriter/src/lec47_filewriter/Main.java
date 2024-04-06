package lec47_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	
	public static void main(String[] args) {
		
		try {
		
			FileWriter writer=new FileWriter("poem.txt");
			writer.append("\n(A Poem by me)");
			writer.close();
		
		
		}
		catch(IOException e){
			
			e.printStackTrace();
			
			
		}
		
		
		
	}
}
