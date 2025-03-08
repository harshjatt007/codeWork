class Solution {  
    public int minimumRecolors(String blocks, int k) {  
        int recolor = 0;  
        int res = k;  
        for (int r = 0; r < blocks.length(); r++) {  
            if (blocks.charAt(r) == 'W') {  
                recolor++;  
            }  
            if (r >= k - 1) {  
                res = Math.min(res, recolor);  
                if (blocks.charAt(r - k + 1) == 'W') {  
                    recolor--;  
                }  
            }  
        }  
        return res;  
    }  
}  