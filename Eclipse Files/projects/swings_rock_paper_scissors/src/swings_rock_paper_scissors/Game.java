package swings_rock_paper_scissors;

import javax.swing.JPanel;

public class Game extends JPanel {

	
			
			
			JTextField roundInput=new 
			
			System.out.print("Enter number of rounds: ");
			int round=scanner.nextInt();
			System.out.println("");
			
			Random random=new Random();
			
			
			int pScore=0;
			int cScore=0;

			
			
			
			String[] moveList=new String[3];
			moveList[0]="Rock";
			moveList[1]="Paper";
			moveList[2]="Scissor";
			
		
			
			
			for(int i=0;i<round;i++) {
				
				
				System.out.println("Round: "+(i+1));
				
				int rand=random.nextInt(3);
				
				String userMove = null;
				System.out.println("Press 1 for Rock");
				System.out.println("Press 2 for Paper");
				System.out.println("Press 3 for Scissor");
				
				System.out.print("Give your move: ");
				int move=scanner.nextInt();
				
				String compMove=moveList[rand];

				
				if (move==1) {
					
					userMove=moveList[0];
					
				}
				if (move==2) {
					
					userMove=moveList[1];
					
				}
				if (move==3) {
					
					userMove=moveList[2];
					
				}
				
				
				

				
				System.out.println("Your move: "+userMove);
				System.out.println("computer's move: "+compMove);
				
				
				if(userMove.equals(moveList[0])&&compMove.equals(moveList[1])) {
					cScore++;
				
				}
				
				if(userMove.equals(moveList[1])&&compMove.equals(moveList[2])) {
					
					cScore++;
					
				}
				if(userMove.equals(moveList[2])&&compMove.equals(moveList[0])) {
					cScore++;
				}
				
				if(userMove.equals(moveList[0])&&compMove.equals(moveList[2])) {
					
					pScore++;
				}
				if(userMove.equals(moveList[1])&&compMove.equals(moveList[0])) {
					
					pScore++;
					
				}
				
				if(userMove.equals(moveList[2])&&compMove.equals(moveList[1])) {
					pScore++;
				}
				
				
				System.out.println("player Score: "+pScore);
				System.out.println("Computer Score:"+cScore);
				System.out.println(" ");
				
			}
			
			
			if(pScore>cScore) {
				
				System.out.println("Player wins");
			}
			else if(cScore>pScore) {
				System.out.println("Computer wins");
			}
			
			else {
				System.out.println("Draw");
			}
			
			
			
			
			
			
			
			
			
			
			
			

		}

	}

	
	
}
