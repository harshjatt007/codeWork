class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            int distA=a[0]*a[0]+a[1]*a[1];
            int distB=b[0]*b[0]+b[1]*b[1];
            return distB-distA; //max heap //descending
        });
        for (int[] p : points) {
        pq.offer(p);
        if (pq.size() > K) {
            pq.poll();
        }
    }
    int[][] res = new int[K][2];
    while (K > 0) {
        res[--K] = pq.poll();
    }
    return res;
    }
}