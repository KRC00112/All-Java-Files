package spiritDetectiveDiaries;

public class HelpClass {
	

	int a;
	
	HelpClass(){
		
		
		String[] help= new String[6];
		help[0]="Description";
		help[1]="Inventory";
		help[2]="Status";
		help[3]="Talk";
		help[4]="Interact";
		help[5]="Quit";
		System.out.print("[");
		
		for(int i=0;i<help.length;i++) {
			
			System.out.print(help[i]);
			
			
			if(i<help.length-1) {
				System.out.print(",");
				
			}
			
			
			
			
		}
		
		
		
		
		
		System.out.println("]");
		
	}
	
	
	public void description(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("you are sitting in the office. A clear "
					+ "white room with no visible signs of exit in your "
					+ "view.\nIt has only got two chairs facing one another "
					+ "and a desk placed in between the two.\nYou are sitting "
					+ "in one while Bartley occupies the other.\nIn the desk "
					+ "you see a flowerpot, a pen,some papers that look\nofficial"
					+ " but with no known government insignia on them. ");
			
		}
		if(a==2) {
			System.out.println("222 ");
			
		}
	
	}
	public void status(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("HP:120");
			
		}
	
	}
	public void inventory(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("inventory array stuff");
			
		}
	
	}
	public void talk(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("Talk to...");
			
		}
	
	}
	public void interact(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("Interact with...");
			
		}
	
	}
	
	


}
