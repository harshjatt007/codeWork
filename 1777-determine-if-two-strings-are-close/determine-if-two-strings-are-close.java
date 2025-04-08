class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char num:word1.toCharArray()){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }

        HashMap<Character,Integer>map2=new HashMap<>();
         for(char num:word2.toCharArray()){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        if(!map1.keySet().equals(map2.keySet())) return false;
         if (!map1.keySet().equals(map2.keySet())) return false;

        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}