package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;

public class JavaApplication2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        if (s.length() == 1){
            System.out.println(s);
            return;
        }
        while(s.length() > 1){
            BigInteger a = new BigInteger(s.substring(0,s.length()/2));
            BigInteger b = new BigInteger(s.substring(s.length()/2));
            s = a.add(b).toString();
            System.out.println(s);
        }
    }
}

