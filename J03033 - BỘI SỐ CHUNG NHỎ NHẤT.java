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
            BigInteger gcd = x.gcd(y);
            BigInteger mul = x.multiply(y);
            System.out.println(mul.divide(gcd));
            
                    
            
                
        }
        
    }    
    
}