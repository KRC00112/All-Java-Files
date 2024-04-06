// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";


        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        boolean palindrome=false;
        s=s.replace(" ","");
        String[] sym = {",", ":", ";", ".", "!", "?", "'", "\"", "(", ")", "[", "]", "{", "}", "-", "_", "/", "\\", "|", "<", ">", "=", "*", "&", "%", "@", "#", "$", "^", "~", "`"};
        for(String i :sym){
            s=s.replace(i,"");
        }
        s=s.toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        if(s.equalsIgnoreCase(rev)){
            palindrome=true;

        }
        else {
            palindrome=false;
        }

        return palindrome;
    }
}