class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        ArrayList<Integer> answer = new ArrayList<>(Collections.nCopies(n, 0));
        
        // Step 1: Apply the difference array technique
        for (int[] booking : bookings) {
            int first = booking[0] - 1;
            int last = booking[1] - 1;
            int seats = booking[2];
            
            answer.set(first, answer.get(first) + seats);
            if (last + 1 < n) {
                answer.set(last + 1, answer.get(last + 1) - seats);
            }
        }
        
        // Step 2: Compute prefix sum
        for (int i = 1; i < n; i++) {
            answer.set(i, answer.get(i) + answer.get(i - 1));
        }
        int[] arr = new int[answer.size()]; 
        for (int i = 0; i < answer.size(); i++) {
            arr[i] = answer.get(i);
        }        
        return arr;
    }
}