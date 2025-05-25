// class Solution {
//     public int longestPalindrome(String[] words) {
//         Map<String, Integer> map = new HashMap<>();
//         int count = 0;
//         boolean hasSinglePalindrome = false;

//         for (String word : words) {
//             map.put(word, map.getOrDefault(word, 0) + 1);
//         }

//         for (String word : map.keySet()) {
//             String reversed = new StringBuilder(word).reverse().toString();

//             if (!word.equals(reversed) && map.containsKey(reversed)) {
//                 int pairs = Math.min(map.get(word), map.get(reversed));
//                 count += pairs * 4;
//                 map.put(word, map.get(word) - pairs);
//                 map.put(reversed, map.get(reversed) - pairs);
//             }
//         }

//         for (String word : map.keySet()) {
//             if (word.charAt(0) == word.charAt(1)) {
//                 int pairs = map.get(word) / 2;
//                 count += pairs * 4;
//                 if (map.get(word) % 2 == 1) {
//                     hasSinglePalindrome = true;
//                 }
//             }
//         }

//         if (hasSinglePalindrome) {
//             count += 2; // one central palindrome like "gg"
//         }

//         return count;
//     }
// }

class Solution {
    public int longestPalindrome(String[] words) {
       HashMap<String,Integer>map=new HashMap<>();
       int count=0;
       boolean hasSingleMiddle=false;
       for(String word:words){
        String rev=""+word.charAt(1)+word.charAt(0);
        if(map.getOrDefault(rev,0)>0){
            count+=4;
            map.put(rev,map.get(rev)-1);
        }
        else map.put(word,map.getOrDefault(word,0)+1);
       }
       for(String key:map.keySet()){
        if(key.charAt(0)==key.charAt(1) && map.get(key)>0){
            hasSingleMiddle=true;
            break;
        }
       }
       if(hasSingleMiddle) count+=2;
       return count;
    }
}
