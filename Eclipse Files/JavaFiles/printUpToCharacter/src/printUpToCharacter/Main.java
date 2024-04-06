package printUpToCharacter;

public class Main {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<appearance;i++) {
			stopper();
			start=end+1;
			sentence=sentence.substring(start);	
		}
	}
	
	public static void stopper() {
		start=0;			
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==fullstop) {
				
				end=sentence.indexOf(sentence.charAt(i));
			}	
		}
		System.out.print(sentence.substring(start,end+1));
	}

}
