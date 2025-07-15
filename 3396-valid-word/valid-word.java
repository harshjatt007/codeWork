class Solution {
    public boolean isValid(String word) {
        boolean vowels=false;
        boolean consonants=false;
        if(word.length()>=3){
            for(char c:word.toCharArray()){
                if(!Character.isDigit(c) && !Character.isLetter(c)) return false;
                if("aeiouAEIOU".contains(String.valueOf(c))) vowels=true;
                if(Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c))) consonants=true;
            }
            if(vowels==true && consonants==true) return true;
        }
        return false;
    }
}