package spiritDetectiveDiaries;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	final static String redLine="\u001B[31m";
	
	final static String resetColor="\u001B[0m";
	
	final static String greenLine="\u001B[32m";
	
	static int a,b,c,d,e;
	
	
	static Scanner scanner=new Scanner(System.in);

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Design Header Stuff
		String programName="\r\n"
				+ "  ____        _      _ _     ____       _            _   _             ____  _            _           \r\n"
				+ " / ___| _ __ (_)_ __(_) |_  |  _ \\  ___| |_ ___  ___| |_(_)_   _____  |  _ \\(_) __ _ _ __(_) ___  ___ \r\n"
				+ " \\___ \\| '_ \\| | '__| | __| | | | |/ _ \\ __/ _ \\/ __| __| \\ \\ / / _ \\ | | | | |/ _` | '__| |/ _ \\/ __|\r\n"
				+ "  ___) | |_) | | |  | | |_  | |_| |  __/ ||  __/ (__| |_| |\\ V /  __/ | |_| | | (_| | |  | |  __/\\__ \\\r\n"
				+ " |____/| .__/|_|_|  |_|\\__| |____/ \\___|\\__\\___|\\___|\\__|_| \\_/ \\___| |____/|_|\\__,_|_|  |_|\\___||___/\r\n"
				+ "       |_|                                                                                            \r\n"
				+ ""
				+ ""
				+ "";
	
		
		
		System.out.println("________________________________________________________________________________________________________");
		System.out.println(programName);
		System.out.println("\n\nVersion 1.0                                                                 By Kaustav Raj Chakraborty");
		System.out.println("________________________________________________________________________________________________________\n");
		//Designing Header ends

		
		

		//general character creation

		System.out.println("Alllright let's see what we have here. ");
		System.out.println("Hello there. you may call me Bartley, I will be your let's just "
				+ "say...the guide throughout this trial of yours,\nplease make yourselves comfortable "
				+ "and seated while I go over your documents.");
		
		System.out.println("Let's start from the beginning, it says here, that your name is... ");
		System.out.println("[What is your name?]");
		System.out.println();
		System.out.print(greenLine+">>> ");
		String name=scanner.nextLine();
		System.out.println(resetColor);

		String[] nameArr=name.split(" ");
		String firstName=nameArr[0];
		String lastName=nameArr[nameArr.length-1];

		
		System.out.println("So your name is "+firstName+" huh?");

		if (nameArr.length==1) {
			System.out.println("No last name? well,That's quite alright.It just that it "
					+ "helps if you have one, \nmakes sorting through the database less of a pain.");
			System.out.println("But you don't have to worry about that, forget i even mentioned.");
		}

		if(nameArr.length>1) {
			System.out.println("and your last name is..hmmm,let's see, "+lastName.substring(0, ((int)(lastName.length()-1)/3))+".."+lastName.substring(0, ((int)(lastName.length()-1)/2))+""+"..."+lastName+"?, is that it?");
		}

		System.out.println("Now, as for your age....");
		int age;
			do {
			System.out.println("[What is your age?]");
			System.out.println();
			System.out.print(greenLine+">>> ");
	
		
			  
	
				try {
					
					age=scanner.nextInt();
					scanner.nextLine();
					System.out.println(resetColor);

					
				    if (age>0 && age<12){
				    	System.out.println("You were practically a child then...");
				    }
				    else if (age>=12 && age<18){
				    	System.out.println("You were a teenager then...");
				    }
				    else if (age>=18 && age<30) {
				    	System.out.println("you were still in your prime then...");
				    	
				    }
				    else if (age>=30) {
				    	System.out.println("you were pretty old then...");
				    }
				    
				    else {
						System.out.println("No that can't be right..let me check again.");
		
				    }
			    
			    
			    
			}catch(InputMismatchException e) {
				System.out.println(resetColor);
				System.out.println("Seriously? Please don't do this to me right now.Come on fix "
						+ "this \"miss-input\" and I \nwill let you off the hook this one time."
						+ "Please take care as to what you\ninput..in..future..official procedures.");
				
                scanner.nextLine(); // Clear the buffer
				
				age=0;
			
				
			}
		}while(age<=0);


		System.out.println("As for your gender let's see...\nThis isn't a compulsory"
				+ " question but it's also fine if you have already put in something  ");

		System.out.println("[What is your gender ?]");
		System.out.println();
		System.out.print(greenLine+">>> ");

		String gender=scanner.nextLine();
		System.out.println(resetColor);

		gender=gender.toLowerCase();

		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")) {
			System.out.println("oh!so you are a male.");
			
		}
		else if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")) {
			System.out.println("oh!So you are a female.");
		}
		else {
			System.out.println("guess you did skip it...as I said it's fine.");
			
		}
		
	

		// character creation ends

		// start telling user about the situation
		
		
		
		System.out.println("Okay! so that's about it. We are done reviewing"
				+ " your documents.As I said\nI am Bartley and I will take all"
				+ " your questions now.");
		
		System.out.println("So, do you have any? ");
		System.out.println();
		
		int DialogueIndex=1;
		int choose = 0;
		BartleyDialogues bd=new BartleyDialogues();
		do {
			
			try {
				bd.questions(DialogueIndex);
				System.out.println();
				System.out.print(greenLine+">>> ");
				choose=scanner.nextInt();
				scanner.nextLine();
				System.out.println(resetColor);
				bd.answers(DialogueIndex, choose);
				System.out.println();
			}catch(InputMismatchException e) {
				
				System.out.println(redLine+"[Enter numbers only]"+resetColor);
				
				scanner.nextLine();
				
				
				
			}
		}while(!(choose>=5));
		
		help(1,1,1,1,1);
	

	
		

	}
	
	public static void help(int a,int b,int c,int d,int e) {
		
		do {
		System.out.println("Enter [Help] for further assistance");
		System.out.print(greenLine+">>>");
		String help=scanner.nextLine();
		System.out.println(resetColor);
		if(help.equalsIgnoreCase("help")) {
			
			new HelpClass();
			
		}
		
		else if(help.equalsIgnoreCase("description")) {
			new HelpClass().description(a);
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();

		}
		else if(help.equalsIgnoreCase("inventory")) {
			new HelpClass().inventory(b);
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
		}
		else if(help.equalsIgnoreCase("status")) {
			new HelpClass().status(c);
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
		}
		else if(help.equalsIgnoreCase("talk")) {
			new HelpClass().talk(d);
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
		}
		else if(help.equalsIgnoreCase("interact")) {
			new HelpClass().interact(e);
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
		}
		
		else if(help.equalsIgnoreCase("quit")) {
			
			System.out.print("Quit program?(Y/n): ");
			String quit=scanner.nextLine();
			
			if(quit.equalsIgnoreCase("y")) {
				
				System.out.println("See you soon ;)");
				
				break;
				
				
			}
			else if(quit.equalsIgnoreCase("n")) {
				
			}
			else if(!(quit.equalsIgnoreCase("n")||quit.equalsIgnoreCase("y"))) {
				
				
				System.out.println(redLine+"[enter valid input]"+resetColor);
				
			}

		}
		
		
		
		}while(true);
		
		
		
		
		
	}
	

}
