package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void main(String[] args){
        int n = nhap.nextInt();
        int res = 0;
        for(int i = 0;i<n;i++){
            int cnt = 0;
            for (int j =0;j<3;j++){
                int x = nhap.nextInt();
                cnt += x;
            }if (cnt >=2) res++;
        }System.out.println(res);
        
        
        
    }    
    
}