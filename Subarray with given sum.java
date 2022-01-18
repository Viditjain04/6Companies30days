static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
       ArrayList<Integer> ans=new ArrayList<>();
       int j=0,temp=0,i=0;
       while(j<n){
           temp+=arr[j];
           if(temp<s){
               j++;
           }else if(temp==s){
               ans.add(i+1);ans.add(j+1);
               return ans;
           }else{
               while(temp>s){
                   temp-=arr[i++];
               }
               if(temp==s){
                   ans.add(i+1);
                   ans.add(j+1);
                   return ans;
               }
               j++;
           }
       }
       ans.add(-1);
       return ans;
        
    }
