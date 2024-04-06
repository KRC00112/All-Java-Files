package someTextManipulation;

public class Main {
	
	public static void main(String[] args) {
		
		String para="Thor (from Old Norse: Þórr) is a prominent god in Germanic paganism. In Norse mythology, he is a hammer-wielding god "
				+ "associated with lightning, thunder, storms, sacred groves and trees, strength, the protection of humankind, hallowing, and fertility. "
				+ "Besides Old Norse Þórr, the deity occurs in Old English as Þunor, "
				+ "in Old Frisian as Thuner, in Old Saxon as Thunar, and in Old High German as Donar, all ultimately stemming from "
				+ "the Proto-Germanic theonym *Þun(a)raz, meaning 'Thunder'.";
		
		// Find the index of the first full stop
		int firstDotIndex = para.indexOf(".");
		
		// Find the index of the second full stop starting from the position after the first full stop
		int secondDotIndex = para.indexOf(".", firstDotIndex + 1);
		
		// Print the substring up to the second full stop
		String show = para.substring(0, secondDotIndex + 1);
		System.out.println(show);
	}
}
