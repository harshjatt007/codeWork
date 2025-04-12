class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer>dir=new LinkedList<>(),rad=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++){
            char c=senate.charAt(i);
            if(c=='D') dir.add(i);
            else if (c=='R') rad.add(i);
        }
        while(!dir.isEmpty() && !rad.isEmpty()){
            if(dir.peek()<rad.peek()) dir.add(n++);
            else rad.add(n++);
            dir.poll();
            rad.poll();
        }
        return (rad.isEmpty())?"Dire":"Radiant";
    }
}