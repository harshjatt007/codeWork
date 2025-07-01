class Solution {
    public int possibleStringCount(String word) {
        /*int freq[]=new int[26];
        int count=1;
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        for(int f:freq){
            if(f>1) count+=f-1;
        }*/
        int count=1;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)) count++;
        }
        return count;

    }
}