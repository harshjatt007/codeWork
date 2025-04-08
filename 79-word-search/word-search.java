class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int column=board[0].length;
        visited=new boolean[row][column];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j] && searchWord(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean searchWord(int row,int col,int index,char[][] board,String word){
        if(index==word.length()) return true;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || word.charAt(index)!=board[row][col] || visited[row][col]) {
        return false;}
        
        visited[row][col]=true;
        if(searchWord(row+1,col,index+1,board,word)||searchWord(row-1,col,index+1,board,word)|| searchWord(row,col+1,index+1,board,word) || searchWord(row,col-1,index+1,board,word)) return true;
        visited[row][col]=false;
        return false;
    }
}