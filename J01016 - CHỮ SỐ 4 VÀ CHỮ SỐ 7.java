package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void main(String[] args){
        String s = nhap.next();
        int cnt = 0;
        for(int i = 0;i < s.length();i++){
            if (s.charAt(i)=='4'||s.charAt(i)=='7'){
                cnt++;
            }
        }if (cnt == 4||cnt == 7)
            System.out.println("YES");
        else 
            System.out.println("NO");
        
    }
}