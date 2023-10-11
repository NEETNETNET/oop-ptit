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
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        BigInteger z = x.subtract(y);
        System.out.println(z);
    }    
    
}