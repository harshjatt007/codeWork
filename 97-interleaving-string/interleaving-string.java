class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m=s1.length(),n=s2.length(),k=s3.length();
        if(m+n!=k) return false;
        Boolean memo[][]=new Boolean[m+1][n+1];
        return helper(s1,0,s2,0,s3,0,memo);
    }
    public boolean helper(String s1,int i,String s2,int j,String s3,int k,Boolean [][]memo){
        if(memo[i][j]!=null) return memo[i][j];
        if(k==s3.length()) return i==s1.length() && j==s2.length();
        boolean ans=false;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            ans=ans || helper(s1,i+1,s2,j,s3,k+1,memo);
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            ans=ans || helper(s1,i,s2,j+1,s3,k+1,memo);
        }
        memo[i][j]=ans;
        return ans;
    }
}