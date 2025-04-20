// class Solution {
//     public int scoreOfParentheses(String s) {
//     int score=0;
//     Stack<Integer>stack=new Stack<>();
//     for(char c:s.toCharArray()){
//         if(c=='(') {
//             stack.push(score);
//             score=0;
//         }
//         else{
//             score=stack.pop()+Math.max(2*score,1);
//         }
//     }
//     return score;
//     }
// }

// Greedy Approach
class Solution {
    public int scoreOfParentheses(String s) {
        int score=0; int depth=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if(c=='(') depth++;
            else {
                depth--;
                if(s.charAt(i-1)=='(')
                score+=1<<depth;
            }
        }
        return score;
    }
}