class Solution {  
    public long countOfSubstrings(String word, int k) {  
        return atleastK(word, k) - atleastK(word, k + 1);  
    }  

    private long atleastK(String word, int k) {  
        Map<Character, Integer> vowelCount = new HashMap<>();  
        long nonVowelCount = 0;  // Changed to long  
        long res = 0;            // Changed to long  
        int l = 0;  

        for (int r = 0; r < word.length(); r++) {  
            char currentChar = word.charAt(r);  
            if ("aeiou".indexOf(currentChar) != -1) {  
                vowelCount.put(currentChar, vowelCount.getOrDefault(currentChar, 0) + 1);  
            } else {  
                nonVowelCount++;  
            }  

            while (vowelCount.size() == 5 && nonVowelCount >= k) {  
                res += (word.length() - r);  // Count valid substrings  
                char leftChar = word.charAt(l);  
                if ("aeiou".indexOf(leftChar) != -1) {  
                    vowelCount.put(leftChar, vowelCount.get(leftChar) - 1);  
                    if (vowelCount.get(leftChar) == 0) {  
                        vowelCount.remove(leftChar);  
                    }  
                } else {  
                    nonVowelCount--;  
                }  
                l++;  
            }  
        }  
        return res;  
    }  
}