 static int equalPartition(int n, int arr[])
    {
        
        int sum=0;
        for(int e:arr) sum+=e;
        if((sum&1)==1) return 0;
        boolean[][] dp=new boolean[n+1][sum/2 + 1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    
                    dp[i][j]=false;
                }else if(j==0){
                    
                    dp[i][j]=true;
                }else{
                    dp[i][j]=dp[i-1][j] ;
                    if(j>=arr[i-1]){
                        dp[i][j] |=dp[i-1][j-arr[i-1]] ;
                    }
                }
            }
        }
        return dp[n][sum/2]==true?1:0;
    }
