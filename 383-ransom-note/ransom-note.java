class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char c:ransomNote.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:magazine.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            int count = entry.getValue();

            if (map2.getOrDefault(key, 0) < count) {
                return false;
            }
        }

        return true;
    }
}