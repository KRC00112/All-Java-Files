package lec32_arrayofobjects;

public class Main {

	public static void main(String[] args) {

//		Food[] fridge=new Food[3];
		
		Food food1=new Food("Pizza");
		Food food2=new Food("Hamburger");
		Food food3=new Food("Hot-dog");
		
		Food [] fridge= {food1, food2, food3};
		
//		fridge[0]=food1;
//		fridge[1]=food2;
//		fridge[2]=food3;
		

		for(int i=0;i<fridge.length;i++) {
		System.out.println(fridge[i]);
		}

		

	}

}
