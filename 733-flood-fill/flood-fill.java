class Solution {
    public void dfs(int row,int col,int initialColor,int newColor,int [][] image,int [][]ans,int [] delRow,int [] delCol){
        ans[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nr=row+delRow[i];
            int nc=col+delCol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==initialColor && ans[nr][nc]!=newColor){
                dfs(nr,nc,initialColor,newColor,image,ans,delRow,delCol);
            }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor=image[sr][sc];
        int [][] ans=image;
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        dfs(sr,sc,initialColor,color,image,ans,delRow,delCol);
        return ans;
    }
}