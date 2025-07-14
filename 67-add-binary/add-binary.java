import java.math.*;
class Solution{
    public String addBinary(String a, String b) {
        BigInteger bigIntA = new BigInteger(a, 2);
        BigInteger bigIntB = new BigInteger(b, 2);
        BigInteger sum = bigIntA.add(bigIntB);
        return sum.toString(2);  
    }
}