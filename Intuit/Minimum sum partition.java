class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int sum=0;
	    for(int e:arr) sum+=e;
	    int avg=(sum)/2 ;int ans=avg;
	    for(int i=avg;i>=0;i--){
	        if(subsetSum(arr,i)==true){ans=i;break;}
	    }
	    return sum-2*ans;
	    
	} 
	static boolean subsetSum(int[] arr,int s1){
	    int n=arr.length;
	    boolean[][] t=new boolean[n+1][s1+1];
	    for(int i=0;i<s1+1;i++){
	        t[0][i]=false;
	    }
	    for(int i=0;i<n+1;i++){
	        t[i][0]=true;
	    }
	    for(int i=1;i<n+1;i++){
	        for(int j=1;j<s1+1;j++){
	        if(arr[i-1]<=j){t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j] ;}
	        else t[i][j]=t[i-1][j];
	    }
	    }
	    return t[n][s1];
	}

}
