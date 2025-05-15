class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String>ans=new ArrayList<>();
        if(words.length==0) return ans;
       ans.add(words[0]);
        int lastGroup=groups[0];
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=lastGroup){
                ans.add(words[i]);
                lastGroup=groups[i];
            }
        }
        return ans;
    }
}