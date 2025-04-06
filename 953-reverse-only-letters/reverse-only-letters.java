class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String str="";
        int index=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                str+=s.charAt(i);
            }
            else {
                str+=sb.charAt(index);
                index++;
            }
        }
        return str;
    }
}