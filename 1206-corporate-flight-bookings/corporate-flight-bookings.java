class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int res[]=new int[n];
        int start,end,seats;
        // Ye Difference Array method hai
        for(int booking[]:bookings){
            start=booking[0]-1; // -1 for converting it to zero index 
            end=booking[1]-1;
            seats=booking[2];
            res[end]+=seats;
            if(start>=1) res[start-1]-=seats;
        }
        // just taking prefix sum in reverse order
        for(int i=n-2;i>=0;i--){
            res[i]+=res[i+1];
        }
        return res;
    }
}