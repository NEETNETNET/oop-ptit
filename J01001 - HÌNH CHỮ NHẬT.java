
package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a = nhap.nextInt();
        int b = nhap.nextInt();
        if (a<=0||b<=0){
            System.out.println(0);
        }else {
            System.out.println((a+b)*2 + " " + a*b);
        }
        
        
          
    }
    
}
