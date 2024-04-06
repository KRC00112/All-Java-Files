package num6_GetWordCount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countWords("Just an example here move along");
		
	}
	
	public static int countWords(String s) {
		
		int num=0;
		
		String delimiter=" ";
		
		String[] words=s.split(delimiter);
		
		for(int i=0;i<words.length;i++) {
			
			num++;
			
		}
		
		System.out.println(num);
		
		return num;
		

	}
	
}
