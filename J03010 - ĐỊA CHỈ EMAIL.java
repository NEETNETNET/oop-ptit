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
        ArrayList<String> mail = new ArrayList<>();
        while(t-- > 0){
            String[] a = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = a[a.length -1];
            for(int i = 0; i < a.length - 1; i++) s += a[i].charAt(0);
            mail.add(s);
            int cnt = Collections.frequency(mail, s);
            s += (cnt == 1 ? "" : cnt) + "@ptit.edu.vn";
            System.out.println(s);
            
            
            
                    
            
                
        }
        
    }    
    
}