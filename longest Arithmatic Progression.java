int lengthOfLongestAP(int[] A, int n) {
        @SuppressWarnings("unchecked")
       HashMap<Integer,Integer>[] dp=new HashMap[n];
       int maxl=1;
       for(int i=0;i<n;i++){
           dp[i]=new HashMap<Integer,Integer>();
           
       }
       (dp[0]).put(0,1);
       for(int i=1;i<n;i++){
           
           for(int j=i-1;j>=0;j--){
                int diff=A[i]-A[j];
                if(dp[j].containsKey(diff)){
                    dp[i].put(diff,dp[j].get(diff)+1);
                }else dp[i].put(diff,2);
                maxl=Math.max(maxl,dp[i].get(diff));
           }
       }
       return maxl;
