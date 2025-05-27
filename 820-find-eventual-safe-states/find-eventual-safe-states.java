class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        // TOPOLOGICAL SORT - Kahn's algo
        int inDegree[]=new int[graph.length];
        ArrayList<ArrayList<Integer>>reverseAdj=new ArrayList<>();
        for(int i=0;i<graph.length;i++) reverseAdj.add(new ArrayList<>());
        for(int u=0;u<graph.length;u++){
        for(int v:graph[u]){
            reverseAdj.get(v).add(u);
            inDegree[u]++;
        }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(inDegree[i]==0) q.add(i);
        }
        ArrayList<Integer>safeNodes=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            safeNodes.add(node);
            for(int it:reverseAdj.get(node)){
                inDegree[it]--;
                if(inDegree[it]==0) q.add(it);
            }
        }
        Collections.sort(safeNodes);
        return safeNodes;
    }
}