class Pair{
    int row;int col;int time;
    Pair(int row,int col,int time){
        this.row=row;this.col=col;this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        int visited[][]=new int[row][col];
        int countFresh=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else  visited[i][j]=0;
                if(grid[i][j]==1) countFresh++;
            }
        }
        int count=0;
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        int tm=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().time;
            tm=Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nr=delRow[i]+r;
                int nc=c+delCol[i];
                if(nr>=0 && nr<row && nc>=0 && nc<col && visited[nr][nc]==0 && grid[nr][nc]==1){
                    q.add(new Pair(nr,nc,t+1));
                    visited[nr][nc]=2;
                    count++;
                }
            }
        }
        return countFresh!=count?-1:tm;
    }
}