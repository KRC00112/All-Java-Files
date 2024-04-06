package trial;

class Solution {

public static int solve(int N, int a, int[] x) {

int diff1, diff2,i,j,temp;

int demo1 = 0, demo2 = 0;

	for(i=0;i<N;i++) {
	
		for(j=i+1;j<0;j++) {
		
			if(x[i]>x[j]){
			
			
			
				temp=x[i];
				x[i]=x[j];
				x[j]=x[i];
			
			
			
			}
		
		
		
			else
			
				i++;
			
			}
	
	}



for(i=0;i<1; i++){
	
	demo1=x[i]; 
	demo2=x[i+1];

}



diff1=demo1-a;
diff2=demo2-a;



	int res;
	
	res=diff1+diff2;

	return res;

//System.out.println(res);



	}

public static void main(String args[]) {
	
	int[] x= {9,4,2,12,67,1,89,34};
	
	solve(8,1,x);
}

}
