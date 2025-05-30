class Solution {
public:
    void dfs(int current,int steps,vector<int>&edges,vector<int>&dist){
        while(current!=-1 && dist[current]==-1){
            dist[current]=steps++;
            current=edges[current];
        }
    }
    int closestMeetingNode(vector<int>& edges, int node1, int node2) {
        int res=-1,n=edges.size(),min_of_max=INT_MAX;
        vector<int>dist1(n,-1),dist2(n,-1);
        dfs(node1,0,edges,dist1);
        dfs(node2,0,edges,dist2);
        for(int i=0;i<n;i++){
            if(dist1[i]>=0 && dist2[i]>=0){
                int maxDist=max(dist1[i],dist2[i]);
                if(maxDist<min_of_max){
                    min_of_max=maxDist;
                    res=i;
                }
            }
        }
        return res;
    }
};