class Solution {
    public String pushDominoes(String dominoes) {
        String s="L"+dominoes+"R";
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(int j=1;j<n;j++){
            if(s.charAt(j)=='.') continue;
            int mid=j-i-1;
            sb.append(s.charAt(i));
            if(s.charAt(i)==s.charAt(j)){
                for(int k=0;k<mid;k++)sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='L'&& s.charAt(j)=='R'){
                for(int k=0;k<mid;k++) sb.append('.'); 
            }
            else {
                int half=mid/2;
                for(int r=0;r<half;r++) sb.append('R'); //right jao
                if(mid%2==1) sb.append('.');
                for(int l=0;l<half;l++) sb.append('L'); //left jao
            }
            i=j;
        }
        sb.append(s.charAt(n - 1));
        return sb.substring(1,sb.length()-1);
    }
}