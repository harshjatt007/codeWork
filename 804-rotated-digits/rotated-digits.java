class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            String val = String.valueOf(i);
            if(val.contains("3") || val.contains("4") || val.contains("7")) continue;
            else if(val.contains("2") || val.contains("5") || val.contains("6") || val.contains("9")) count++;
        }
        return count;
    }
}