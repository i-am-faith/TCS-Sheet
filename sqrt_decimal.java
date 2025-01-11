import java.util.* ;
import java.io.*; 
import java.math.*;
public class Solution {
    public static double squareRoot(long n, int d) {
        // Calculating the square root using Math.sqrt
        double sqrtValue = Math.sqrt(n);
        
        // Using BigDecimal for precision control without rounding
        BigDecimal bd = new BigDecimal(sqrtValue);
        bd = bd.setScale(d, RoundingMode.FLOOR);  // Truncate instead of rounding
        
        // Returning the truncated value as double
        return bd.doubleValue();
    }
}