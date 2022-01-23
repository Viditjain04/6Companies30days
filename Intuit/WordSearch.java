class Solution
{
     public boolean isWordExist(char[][] board, String word)
    {
        int[][] direction={{0,-1},{-1,0},{1,0},{0,1}};
        boolean[][] vis=new boolean[board.length][board[0].length];
       int ans=0;
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
               if(board[i][j]==word.charAt(0)){
                   ans+=rec(i,j,0,word,board,vis,direction);
               }           
               
           }
       }
       return ans>0;
    }
    int rec(int r,int c,int ind,String word,char[][] board,boolean[][] vis,int[][] direction){
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || ind>=word.length() || vis[r][c] || word.charAt(ind)!=board[r][c]){
            return 0;
        }else if(ind==word.length()-1 && word.charAt(ind)==board[r][c]){
            return 1;
            
        }
        int ans=0;
        vis[r][c]=true;
        for(int i=0;i<direction.length;i++){
            
           ans+= rec(r+direction[i][0],c+direction[i][1],ind+1,word,board,vis,direction);
            
        }
        
        vis[r][c]=false;
        return ans;
        
        
    }
}
