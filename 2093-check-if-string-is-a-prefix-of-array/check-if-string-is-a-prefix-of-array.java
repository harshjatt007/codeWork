class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int i=0,j=0;
        String match="";
        while(i<s.length() && j<words.length){
            match+=words[j];
            if(s.equals(match)) return true;
            if(!s.contains(match)){
                return false; }
                i+=words[j].length();
                j++;
        }
        return false;
    }
}