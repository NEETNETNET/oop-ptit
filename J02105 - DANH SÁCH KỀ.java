package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    static Scanner nhap = new Scanner(System.in);
    
    public static void main(String[] args){
        int n = nhap.nextInt();
        int x;
        for (int i = 1;i<=n;i++){
            System.out.printf("List(%d) = ", i);
            for(int j =1;j<=n;j++){
                x = nhap.nextInt();
                if (x==1) System.out.printf("%d ", j);
            }System.out.println();
        }
        
        
        
        
    }    
    
}