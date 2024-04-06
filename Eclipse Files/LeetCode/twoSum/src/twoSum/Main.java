package twoSum;

public class Main {
		
	public static  int[] twoSum(int[] nums, int target) {
		
		
		
		int nums1[]= nums;
		
		int target1=target;
		
		int i,j;
		int count=0;
				
		
		
		for( i=0;i<nums1.length;i++) {
			
			
			
			for( j=1;j<nums1.length;j++) {
				
				
				if(nums1[i]+nums1[j]==target1) {
					while(count<=0) {
						
					System.out.println("["+i+","+j+"]");
					
					count++;
					}
					
		
				}
				
					if(i==j) {
					
					break;

				}
					
					
					

			}
			
		
		}
		
		
		
		return nums1;
	        
	    }
	
	 public static void main(String[] args) {
			
			
			int[] nums = {1,3} ;
	        int target = 6  ;
			twoSum(nums,target);
		
			

		}
	
	
	
	

}
