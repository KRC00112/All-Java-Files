public class number19 {

//    19. Write a program to find out the average of 13 integers stored in
//    an array.

    public number19(){


        int[] numbers={8,8,3,4,5,6,7,8,9,10,8,12,13};


        int sum=0;

        for(int i:numbers){
            sum=sum+i;

        }

        System.out.println(sum/numbers.length);




    }


}
