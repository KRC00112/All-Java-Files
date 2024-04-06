package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calculator app");
		System.out.println();
		
		double num1;
		double num2;
		String choice;
		double result;
		String choice2 = null;
		char operator;
		double newnum;
		
		do {
			
			
			
		
			System.out.print("Write the symbol of the operation you want to perform(+,-,*,/): ");
			
			Scanner scanner=new Scanner(System.in);
			operator=scanner.next().charAt(0);
			
			
			if(operator=='+') {
				
				System.out.print("Enter first number: ");
				num1=scanner.nextDouble();
				System.out.print("Enter second number: ");
				num2=scanner.nextDouble();
				result=num1+num2;
				System.out.println(num1+"+"+num2+"="+result);
				scanner.nextLine();
				System.out.print("do you want to continue with this calculation(y/n): ");
				choice2=scanner.nextLine();
				
				while(choice2.equalsIgnoreCase("y"))
				{
					
					
					System.out.print("Write the operation you want to perform: ");
					operator=scanner.next().charAt(0);
	
					if(operator=='+') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result+=newnum);
						
					}
					else if(operator=='-') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result-=newnum);
						
					}
					else if(operator=='*') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result*=newnum);
						
					}
					else if(operator=='/') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result/=newnum);
						
					}
					
					
					scanner.nextLine();
					System.out.print("do you want to continue with this calculation(y/n): ");
					choice2=scanner.nextLine();
					
					
				}
				
					
					
				}
				
				
			
			
			
			else if(operator=='-') {
				
				System.out.print("Enter first number: ");
				num1=scanner.nextDouble();
				System.out.print("Enter second number: ");
				num2=scanner.nextDouble();
				result=num1-num2;
				System.out.println(num1+"-"+num2+"="+result);
				scanner.nextLine();
				System.out.print("do you want to continue with this calculation(y/n): ");
				choice2=scanner.nextLine();
				
				while(choice2.equalsIgnoreCase("y"))
				{
					
					
					System.out.print("Write the operation you want to perform: ");
					operator=scanner.next().charAt(0);
	
					if(operator=='+') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result+=newnum);
						
					}
					else if(operator=='-') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result-=newnum);
						
					}
					else if(operator=='*') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result*=newnum);
						
					}
					else if(operator=='/') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result/=newnum);
						
					}
					
					
					scanner.nextLine();
					System.out.print("do you want to continue with this calculation(y/n): ");
					choice2=scanner.nextLine();
					
					
				}
				
				
			}
			else if(operator=='*') {
				
				System.out.print("Enter first number: ");
				num1=scanner.nextDouble();
				System.out.print("Enter second number: ");
				num2=scanner.nextDouble();
				result=num1*num2;
				System.out.println(num1+"*"+num2+"="+result);
				scanner.nextLine();
				System.out.print("do you want to continue with this calculation(y/n): ");
				choice2=scanner.nextLine();
				
				while(choice2.equalsIgnoreCase("y"))
				{
					
					
					System.out.print("Write the operation you want to perform: ");
					operator=scanner.next().charAt(0);
	
					if(operator=='+') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result+=newnum);
						
					}
					else if(operator=='-') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result-=newnum);
						
					}
					else if(operator=='*') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result*=newnum);
						
					}
					else if(operator=='/') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result/=newnum);
						
					}
					
					
					scanner.nextLine();
					System.out.print("do you want to continue with this calculation(y/n): ");
					choice2=scanner.nextLine();
					
					
				}
				
			}
			else if(operator=='/') {
				
				System.out.print("Enter first number: ");
				num1=scanner.nextDouble();
				System.out.print("Enter second number: ");
				num2=scanner.nextDouble();
				result=num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
				scanner.nextLine();
				System.out.print("do you want to continue with this calculation(y/n): ");
				choice2=scanner.nextLine();
				
				while(choice2.equalsIgnoreCase("y"))
				{
					
					
					System.out.print("Write the operation you want to perform: ");
					operator=scanner.next().charAt(0);
	
					if(operator=='+') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result+=newnum);
						
					}
					else if(operator=='-') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result-=newnum);
						
					}
					else if(operator=='*') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result*=newnum);
						
					}
					else if(operator=='/') {
						
						System.out.print("enter num: ");
						newnum=scanner.nextDouble();
						
						System.out.println(result/=newnum);
						
					}
					
					
					scanner.nextLine();
					System.out.print("do you want to continue with this calculation(y/n): ");
					choice2=scanner.nextLine();
					
					
				}
				
			}
			
			else {
				System.out.println("Enter a valid operator.");
			}
			
			
			do {
				System.out.print("Do you wish to continue/renew(y/n): ");
				choice=scanner.nextLine();
			}while((!(choice.equalsIgnoreCase("n"))&& !(choice.equalsIgnoreCase("y"))));
		

		}while(choice.equalsIgnoreCase("y"));
		
		if(choice.equalsIgnoreCase("n")) {
			
			System.out.println("You exit");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}