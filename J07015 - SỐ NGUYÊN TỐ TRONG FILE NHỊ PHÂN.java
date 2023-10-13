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
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class JavaApplication2 {
    public static boolean nt(int n){
        if(n < 2) return false;
        for (int i = 2;i<=Math.sqrt(n);i++){
            if (n%i == 0) return false;
        }return true;
    }

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) oi.readObject();
        int[] cnt = new int[10000];
        for (Integer i : list){
            if(nt(i)) cnt[i]++;
        }
        for (int i = 2;i<10000;i++){
            if(cnt[i] > 0) System.out.println(i+" " + cnt[i]);
        }
                
    }
}

