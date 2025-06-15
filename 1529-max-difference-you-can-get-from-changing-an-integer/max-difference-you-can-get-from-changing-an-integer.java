class Solution {
    public int maxDiff(int num) {
        String numString=Integer.toString(num);
        String maxString=numString;
        String minString=numString;

        for(char c:numString.toCharArray()){
            if(c!='9'){
                maxString=maxString.replace(c,'9'); break;
            }
        }
        for(int i=0;i<minString.length();i++){
            char c=minString.charAt(i);
            if(c!='1'&& i==0){
                minString=minString.replace(c,'1');
                 break;
            }
            else if(c!='0' && i!=0 && c!=minString.charAt(0)){
                minString=minString.replace(c,'0'); break;
            }
        }
        return Integer.parseInt(maxString)-Integer.parseInt(minString);
    }
}