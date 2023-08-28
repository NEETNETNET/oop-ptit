package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void test(){
        String s = nhap.next();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2') {
                System.out.println("NO");
                return;
            }
        }System.out.println("YES");
    }
    public static void main(String[] args){
        int t = nhap.nextInt();
        while(t-- >0){
            test();
        }
        
        
    }
}