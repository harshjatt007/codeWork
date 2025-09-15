class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean freq[]=new boolean[26];
        int count=0;
        for(int i=0;i<brokenLetters.length();i++){
            freq[brokenLetters.charAt(i)-'a']=true;
        }
        String words[]=text.split(" ");
        for(String word:words){
            boolean flag=false;
            for(char c:word.toCharArray()){
                if(freq[c-'a']==true){
                    flag=true;
                    break;
                }
            }
           if (flag==false) count++;
        }
        return count;
    }
}