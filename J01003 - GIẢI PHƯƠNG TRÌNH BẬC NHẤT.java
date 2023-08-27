package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        float a = nhap.nextFloat();
        float b = nhap.nextFloat();
        if (a == 0f){
            if (b == 0f){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else {
            System.out.println(String.format("%.2f", -b/a));
        }
                
               
    }
}