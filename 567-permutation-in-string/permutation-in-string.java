class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char c[]=s1.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String str=s2.substring(i,i+s1.length());
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            if(Arrays.equals(ch,c)) return true;
        }
        return false;
    }
}