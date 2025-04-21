class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = magazine.length(), n = ransomNote.length();
        if(m < n) return false;
        int[] alphabetFrequency = new int[26];
        for(char c: magazine.toCharArray()) {
            alphabetFrequency[c - 'a']++;
        }
        for(char c: ransomNote.toCharArray()) {
            if(alphabetFrequency[c - 'a'] == 0) return false;
            alphabetFrequency[c - 'a']--;
        }
        return true;
    }
}

/*
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] freq=new int[26];
        for(char c:ransomNote.toCharArray()){
            int cnt=magazine.indexOf(c,freq[c-'a']);
            if(cnt==-1)
            return false;
            freq[c-'a']=cnt+1;
        }
        return true;
    }
}
*/