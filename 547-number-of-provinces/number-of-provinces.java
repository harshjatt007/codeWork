class Solution {
    public void dfs(int node,int [][] isConnected,int visited[]){
        visited[node]=1;
        for(int it=0;it<isConnected.length;it++){
            if(visited[it]==0 && isConnected[node][it]==1){
                dfs(it,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int visited[]=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
}