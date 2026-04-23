class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(String word:dictionary){
                if(word.length()!=queries[i].length()) continue;
                char[] first = queries[i].toCharArray();
                char [] second= word.toCharArray();
                int diff=0;
                for(int idx=0;idx<word.length();idx++){
                    if(first[idx]!=second[idx]) diff++;
                    if(diff>2){
                        break;
                    }
                }
               if (diff <= 2) {
                    ans.add(queries[i]);
                    break; // add only once
                }
            }
        }
        return ans;
    }
}