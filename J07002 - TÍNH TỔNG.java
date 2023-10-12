package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class javaApplication2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            }catch(Exception e){
            }
        }System.out.println(sum);
    }
}

