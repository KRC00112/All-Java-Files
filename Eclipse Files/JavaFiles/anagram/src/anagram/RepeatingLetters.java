package anagram;

public class RepeatingLetters {
	

  

    public int countRepeatedLetters(String str) {
        int[] letterCount = new int[26]; // Assuming only English alphabet letters are counted

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                char lowercaseC = Character.toLowerCase(c);
                int index = lowercaseC - 'a';
                letterCount[index]++;
            }
        }

        int repeatedCount = 0;
        for (int count : letterCount) {
            if (count > 1) {
                repeatedCount += count;
            }
        }

        return repeatedCount;
    }
    
    
    
    
}
