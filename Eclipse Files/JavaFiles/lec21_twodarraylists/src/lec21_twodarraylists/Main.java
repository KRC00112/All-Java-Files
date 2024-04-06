package lec21_twodarraylists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		
		ArrayList<ArrayList<String>> mainlist=new ArrayList();

		
		
		ArrayList<String> stationary=new ArrayList<String>();
		stationary.add("pen");
		stationary.add("pencil");
		stationary.add("eraser");
		ArrayList<String> grocery=new ArrayList<String>();
		grocery.add("cabbage");
		grocery.add("spinach");
		grocery.add("broccoli");
		ArrayList<String> furniture=new ArrayList<String>();
		furniture.add("sofa");
		furniture.add("Dining table ");
		furniture.add("chair");
		
		
		
		mainlist.add(stationary);
		mainlist.add(grocery);
		mainlist.add(furniture);

		System.out.println(mainlist.get(2).get(0));
		
		
		
		
	}

}