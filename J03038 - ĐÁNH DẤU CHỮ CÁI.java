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
        int[] cnt = new int[130];
        int ans = 0;
        for(int i = 0;i<s.length();i++)
            cnt[s.charAt(i)]++;
        for(char x = 'a';x<='z';x++){
            if(cnt[x] > 0) ans++;
        }System.out.println(ans);
    }
        
            
                    
            
                
        
        
        
    
}