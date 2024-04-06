import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //store 5 numbers
        int[] numbers=new int[5];

        //store 5 names
        String[] names=new String[5];


        //data of 5 students:{roll no,name,marks}

        int[] rollNo=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];

        Student[] students=new Student[5];


        Student kaustav=new Student(13,"kaustav",45.7f);
        kaustav.show();

        Student Anthony=new Student(19,"Anthony",67.2f);
        System.out.println(Anthony);//because of toString method we can directly get the final result without addressing any particular method


    }

    //create a class

    public static class Student{

        int rollNo;
        String name;
        float marks;

        Student(int rn,String n,float m){
            /* were the parameters here the same name as the instance variables,
             we would have needed to put "this." before the instance variable
             in the constructor to assign the parameterized values to the instance
             variables.*/

            rollNo=rn;
            name=n;
            marks=m;




        }


        public void show(){

            System.out.println("The Student's name is "+name+", their roll number is "+rollNo+"\nand they have obtained "+marks+" marks in the exam.");


        }

        public String toString(){

            String direct="The Student's name is "+name+", their roll number is "+rollNo+"\nand they have obtained "+marks+" marks in the exam.";


            return direct;
        }






    }


}