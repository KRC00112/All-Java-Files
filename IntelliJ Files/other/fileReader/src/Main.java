import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {


        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\Desktop\\readwrite.txt"));
        writer.write("hello. how are you");
        writer.newLine();
    }
}