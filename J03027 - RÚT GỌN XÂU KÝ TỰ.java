package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;

public class JavaApplication2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(true){
            int ok = 1;
            for(int i = 0;i< s.length() - 1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    s = s.substring(0,i) + s.substring(i+2);
                    ok = 0;
                    break;
                }
            }if (ok == 1) break;         
        }
        if (s.equals("")) System.out.println("Empty String");
        else System.out.println(s);
    }
        
            
                    
            
                
        
        
        
    
}