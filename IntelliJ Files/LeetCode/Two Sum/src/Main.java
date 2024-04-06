// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] nums={1,7,2,15};
        int target =9;
        int[] myNums=twoSum(nums,target);

        for(int i : myNums){
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] myNums=new int[2];
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target) {

                    myNums[0] = i;
                    myNums[1] = j;

                }

            }

        }

        return myNums;
    }
}