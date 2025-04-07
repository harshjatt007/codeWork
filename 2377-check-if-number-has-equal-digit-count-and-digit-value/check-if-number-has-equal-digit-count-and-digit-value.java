class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:num.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<num.length();i++){
           char expectedDigit=(char)(i+'0');
           int expectedCount=num.charAt(i)-'0';
           if(map.getOrDefault(expectedDigit,0)!=expectedCount) return false;

        }
        return true;
    }
}