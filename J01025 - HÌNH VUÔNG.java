package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    static Scanner nhap = new Scanner(System.in);
    
    public static void main(String[] args){
        int x1 = nhap.nextInt();
        int y1 = nhap.nextInt();
        int x2 = nhap.nextInt();
        int y2 = nhap.nextInt();
        int x3 = nhap.nextInt();
        int y3 = nhap.nextInt();
        int x4 = nhap.nextInt();
        int y4 = nhap.nextInt();
        int xmax = Math.max(x1, Math.max(x2,Math.max(x3,x4)));
        int ymax = Math.max(y1, Math.max(y2,Math.max(y3,y4)));
        int xmin = Math.min(x1, Math.min(x2,Math.min(x3,x4)));
        int ymin = Math.min(y1, Math.min(y2,Math.min(y3,y4)));
        int k = Math.max(xmax-xmin, ymax-ymin);
        System.out.println(k*k);
        
    }    
    
}