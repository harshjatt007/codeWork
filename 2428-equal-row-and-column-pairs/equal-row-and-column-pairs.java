class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        HashMap<List<Integer>,Integer>map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            List<Integer>arr=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                arr.add(grid[i][j]);
            }
            map.put(arr,map.getOrDefault(arr,0)+1);

        }
        for(int j=0;j<grid[0].length;j++){
            List<Integer>arr=new ArrayList<>();
            for(int i=0;i<grid.length;i++){
                arr.add(grid[i][j]);
            }
            if(map.containsKey(arr)){
                count+=map.get(arr);
            }
        } 
        return count;       
    }
}