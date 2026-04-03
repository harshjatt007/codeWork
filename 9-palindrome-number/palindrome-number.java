class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb=new StringBuilder(String.valueOf(x));
        sb.reverse();
        return sb.toString().equals(String.valueOf(x));
    }
}