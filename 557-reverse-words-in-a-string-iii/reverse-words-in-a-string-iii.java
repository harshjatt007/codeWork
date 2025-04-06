class Solution {
    public String reverseWords(String s) {
        String words[]=s.split("\\s+");
        String str="";
        // int start=0;
        // int end=s.length()-1;
        // while(start<end){
        //     if
        // }
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            if(word!=words[words.length-1]){
            str+=sb.reverse().toString()+" ";
            }
            else str+=sb.reverse().toString();
        }
        return str;
    }
}