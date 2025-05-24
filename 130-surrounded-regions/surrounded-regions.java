class Solution {
    public void dfs(int row,int col,int [][] vis,char [][]board,int delRow[],int delCol[],int n,int m){
        vis[row][col]=1;
        for(int i=0;i<4;i++){
            int nr=row+delRow[i];
            int nc=col+delCol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]=='O' && vis[nr][nc]==0){
                dfs(nr,nc,vis,board,delRow,delCol,n,m);
            }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int[n][m];
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        for(int j=0;j<m;j++){
            // first Row
            if(vis[0][j]==0 && board[0][j]=='O'){
                dfs(0,j,vis,board,delRow,delCol,n,m);
            }
            // last Row
            if(vis[n-1][j]==0 && board[n-1][j]=='O'){
                dfs(n-1,j,vis,board,delRow,delCol,n,m);
            }
        }
        for(int i=0;i<n;i++){
            // first Column
            if(vis[i][0]==0 && board[i][0]=='O'){
                dfs(i,0,vis,board,delRow,delCol,n,m);
            }
            // Last Column
            if(vis[i][m-1] ==0 && board[i][m-1]=='O'){
                dfs(i,m-1,vis,board,delRow,delCol,n,m);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
}