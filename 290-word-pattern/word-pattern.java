// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         String[] words = s.split("\\s+");
//         if (pattern.length() != words.length) return false;

//         HashMap<Character, String> charToWord = new HashMap<>();
//         HashMap<String, Character> wordToChar = new HashMap<>();

//         for (int i = 0; i < pattern.length(); i++) {
//             char c = pattern.charAt(i);
//             String word = words[i];

//             if (charToWord.containsKey(c)) {
//                 if (!charToWord.get(c).equals(word)) return false;
//             } else {
//                 if (wordToChar.containsKey(word)) return false;

//                 charToWord.put(c, word);
//                 wordToChar.put(word, c);
//             }
//         }

//         return true;
//     }
// }

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split("\\s+");
        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) return false;
            } else {
                // word kisi or character ke sath b mapped ha
                if (map.containsValue(word)) return false;
                map.put(c, word);
            }
        }

        return true;
    }
}
