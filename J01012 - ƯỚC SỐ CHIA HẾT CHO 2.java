package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void main(String[] args){
        int t = nhap.nextInt();
        while(t-- >0){
            int cnt = 0; 
            int n = nhap.nextInt();
            for(int i = 1;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    if (i%2==0) cnt++;
                    if ((n/i)%2==0 && i!=Math.sqrt(n)) cnt++;  
                }
            }System.out.println(cnt);
                    
        }
        
        
    }
}