class Solution {
    public boolean validateKar(String s){
         int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        int allowedDelete=1;
        boolean flag=false;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else if(allowedDelete!=0){
                flag= validateKar(s.substring(start+1,end+1)) || validateKar(s.substring(start,end));
                return flag;
            }
           
        }
        return true;
    }
}