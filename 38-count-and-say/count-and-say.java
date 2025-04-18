// class Solution {
//     public String countAndSay(int n) {
//         String res="1";
//         for(int i=1;i<n;i++){
//             StringBuilder sb=new StringBuilder();
//             int count=1;
//             for(int j=1;j<res.length();j++){
//                 if(res.charAt(j)==res.charAt(j-1)){
//                     count++;
//                 }
//                 else{
//                     sb.append(count).append(res.charAt(j-1));
//                     count=1;
//                 }
//             }
//             sb.append(count).append(res.charAt(res.length()-1));
//             res=sb.toString();
//         }
//         return res;
//     }
// }

class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String res=countAndSay(n-1);
        StringBuilder ans=new StringBuilder();
        int count=1;
        for(int i=1;i<res.length();i++){
            if(res.charAt(i)==res.charAt(i-1)) count++;
            else{
                ans.append(count).append(res.charAt(i-1));
                count=1;
            }
        }
        ans.append(count).append(res.charAt(res.length()-1));
        return ans.toString();
    }
}
