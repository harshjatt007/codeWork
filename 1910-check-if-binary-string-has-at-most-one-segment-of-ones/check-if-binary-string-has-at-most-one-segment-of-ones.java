class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==0 && s.charAt(0)=='1') return true;
        boolean gotzero =false;
        for(int i=1;i<s.length();i++){
            if(gotzero==true && s.charAt(i)=='1') return false;
            else if(s.charAt(i)=='0') gotzero=true;
        }
        return true;
    }
}