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
        int maxi = 0;
        int[] cnt = new int[2005];
        int ok = 1;
        for(int i = 0;i<n;i++){
            int x = nhap.nextInt();
            maxi = Math.max(x,maxi);
            cnt[x] = 1;
        }for(int i = 1;i<=maxi;i++){
            if(cnt[i] == 0) {
                System.out.println(i);
                ok = 0;
            }
        }if (ok == 1) System.out.println("Excellent!");
        
        
        
    }    
    
}