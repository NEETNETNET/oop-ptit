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
        int[][] a = new int[n+1][n+1];
        for (int i = 0;i<n;i++){
            for(int j =0;j<n;j++) a[i][j] = nhap.nextInt();
        }for (int i = 0;i<n;i++){
            for(int j =0;j<n;j++) {
                if(a[i][j]==1 && i<j) System.out.printf("(%d,%d)\n",i+1,j+1);
            }
        }
        
        
        
        
    }    
    
}