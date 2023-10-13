package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class JavaApplication2 {
    public static final int N = (int) 1e6;
    
    public static boolean nt(int n){
        if(n<2) return false;
        for (int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }return true;
    }
  
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) oi.readObject();
        int[] cnt = new int[N+1];
        for(Integer i : a){
            if(nt(i)) cnt[i]++;
        }
        int check = 0;
        for(int i = N;i>=2;i--){
            if(cnt[i] > 0){
                System.out.println(i+ " " + cnt[i]);
                check++;
                if (check==10) break;
            }
        }
        
    }
}

