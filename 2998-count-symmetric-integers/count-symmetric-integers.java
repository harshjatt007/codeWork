class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String num=Integer.toString(i);
            int len=num.length();
            if(len%2!=0) continue;
            int half=len/2;
            int firstSum=0;
            int lastSum=0;
            for(int f=0;f<half;f++){
                firstSum+=num.charAt(f)-'0';
            }
            for(int l=half;l<len;l++){
                lastSum+=num.charAt(l)-'0';
            }
            if(firstSum==lastSum) count++;
        }
        return count;
    }
}