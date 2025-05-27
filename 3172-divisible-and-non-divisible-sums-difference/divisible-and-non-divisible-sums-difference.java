class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n + 1) / 2; // sum of first n natural numbers
        int divisibleSum = m * (n / m) * (n / m + 1); // sum of first n multiples of m
        return totalSum - divisibleSum;
    }
}