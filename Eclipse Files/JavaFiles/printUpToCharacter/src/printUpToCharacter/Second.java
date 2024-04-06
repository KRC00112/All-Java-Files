package printUpToCharacter;

public class Second {

	static String sentence="Metal Gear (Japanese: メタルギア, Hepburn: Metaru Gia) is a franchise"
			+ " of historical fiction based role playing epic filmography stealth games created"
			+ " by Hideo Kojima. Developed and published by Konami, the first game, Metal Gear,"
			+ " was released in 1987 for MSX home computers. The player often takes control of a"
			+ " special forces operative (usually Solid Snake or Big Boss), who is assigned the task"
			+ " of finding the titular superweapon, \"Metal Gear\", a bipedal walking tank with the"
			+ " ability to launch nuclear weapons.\r\n";
			
	
	static char fullstop='.';
	static int end=0;
	static int appearance=2;//change this to find all "appearance" number of sentences in the text.
	static int start=0;	

	public static void generated(String sentence) {
		
		for(int i=0;i<appearance;i++) {
			start=0;			
			for(int j=0;j<sentence.length();j++) {
				if(sentence.charAt(j)==fullstop) {
					
					end=sentence.indexOf(sentence.charAt(j));
				}	
			}
			System.out.print(sentence.substring(start,end+1));
			start=end+1;
			sentence=sentence.substring(start);	
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		generated(sentence);
		
		
	
	}
	


	

}
