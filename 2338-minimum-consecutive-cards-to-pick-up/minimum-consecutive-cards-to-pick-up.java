class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer>lastSeen=new HashMap<>();
        int result=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            int card=cards[i];
            if(lastSeen.containsKey(card)){
                int len=i-lastSeen.get(card)+1;
                if(len<result) result=len;
            }
            lastSeen.put(card,i);
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}