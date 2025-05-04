// class Solution {
//     public String truncateSentence(String s, int k) {
//         String words[]=s.split(" ");
//         if(k>words.length) return "-1";
//         String ans="";
//         for(int i=0;i<k;i++){
//             ans+=words[i];
//             if(i!=k-1) ans+=" ";
//         }
//         return ans;
//     }
// }

class Solution {
    public String truncateSentence(String s, int k) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') k--;
            if(k==0) return s.substring(0,i);
        }
        return s;
    }
}