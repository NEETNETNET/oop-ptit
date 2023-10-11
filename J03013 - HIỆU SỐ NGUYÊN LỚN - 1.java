package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.math.BigInteger;
import java.util.*;

public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            BigInteger z = x.subtract(y).abs();
            
            StringBuilder a = new StringBuilder(z.toString());
            int lenMax = Math.max(x.toString().length(), y.toString().length());
            while (a.length() < lenMax) a.insert(0, '0');
            System.out.println(a);
                    
            
                
        }
        
    }    
    
}