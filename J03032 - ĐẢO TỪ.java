package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;

public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for(int i = 0;i<a.length;i++){
                String x = new StringBuilder(a[i]).reverse().toString();
                System.out.print(x + " ");
            }System.out.print("\n");
            
        }
            
                    
            
                
        
        
    }    
    
}