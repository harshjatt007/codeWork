class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int Lcount=0;
        int Rcount=0;
        for(char c:moves.toCharArray()){
            if(c=='L') Lcount++;
            else if( c=='R') Rcount++;
        }
        char max='_';
        if(Lcount>=Rcount) max='L';
        else if(Rcount>Lcount) max='R';
        int count=0;
        for(char c:moves.toCharArray()){
            if(c=='_' || c==max)  count++;
            else count --;
        }   
        return count;
    }
}