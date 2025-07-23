class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x<y){
            return maximumGain(swap(s),y,x);
        }
        int res=0;
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()=='a' && c=='b'){
                res+=x;
                stack.pop();
            }
            else stack.push(c);
        }
        Stack<Character>temp=new Stack<>();
        while(!stack.isEmpty()) temp.push(stack.pop());
        while(!temp.isEmpty()){
            char c=temp.pop();
            if(!stack.isEmpty() && stack.peek()=='b' && c=='a'){
                stack.pop();
                res+=y;
            }
            else stack.push(c);
        }
        return res;

    }
    public String swap(String s){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='a') sb.append('b');
            else if(c=='b') sb.append('a');
            else sb.append(c);
        }
        return sb.toString();
    }
}