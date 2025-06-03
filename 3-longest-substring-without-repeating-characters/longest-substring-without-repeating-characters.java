class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int left=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            ans=Math.max(right-left+1,ans);
        }
        return ans;
    }
}