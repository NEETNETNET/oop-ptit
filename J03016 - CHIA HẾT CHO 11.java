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
            BigInteger y = new BigInteger("11");
            if (x.remainder(y).intValue() == 0 ) 
                System.out.println(1);
            else
                System.out.println(0);
            
                    
            
                
        }
        
    }    
    
}