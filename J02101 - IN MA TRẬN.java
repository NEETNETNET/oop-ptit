package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t-- >0){
            int n = nhap.nextInt();
            int[][] a = new int[n][n];
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++) a[i][j] = nhap.nextInt();
            }for(int i = 0;i<n;i++){
                if(i%2==0){
                    for(int j = 0;j<n;j++) System.out.printf(a[i][j] + " ");
                }else {
                    for(int j =n-1;j>=0;j--) System.out.printf(a[i][j]+" ");
                }
            }System.out.println();
        }
    }    
    
}