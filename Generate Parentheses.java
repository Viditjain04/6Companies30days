  
    public List<String> AllParenthesis(int n) 
    {
        List<String> ans=new ArrayList<>();
        back(ans,n,n,"");
        return ans;
    }
    void back(List<String> ans,int o,int c,String s){
        if(o==0){
            while(c-->0){
                s=s+")";
            }
            
            ans.add(s);
            return ;
        }
        if(o>=c){
            back(ans,o-1,c,s+"(");
        }else{
            back(ans,o-1,c,s+"(");
            back(ans,o,c-1,s+")");
        }
    }
