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
    public static String change(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String a = sc.nextLine();
            if(a.equals("END")) break;
            String[] s = a.trim().split("\\s+");
            for(String i : s){
                System.out.print(change(i) + " ");
            }System.out.print("\n");
        }
    }
}

