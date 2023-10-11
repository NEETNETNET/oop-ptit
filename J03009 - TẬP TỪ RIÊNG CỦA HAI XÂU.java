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
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a = s1.split("\\s+");
            List<String> check = Arrays.asList(s2.split("\\s+"));
            Set<String> ans = new TreeSet<String>();
            for (String i : a){
                if(!check.contains(i)) 
                    ans.add(i);
            }
            for (String i : ans) System.out.print(i + " ");
            System.out.println();
                
        }
        
    }    
    
}