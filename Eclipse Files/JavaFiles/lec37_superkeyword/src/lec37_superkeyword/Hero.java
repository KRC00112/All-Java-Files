package lec37_superkeyword;

public class Hero extends Person {
	
	String powers;
	
		Hero(String name,int age,String powers){
			
			super(name,age);
			
			this.powers=powers;
			
		}
		
		public String toString() {
			
			
			
			return super.toString()+this.powers;
		}
		

}
