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
import static java.lang.Double.parseDouble;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Product implements Comparable<Product>{
    private static int cnt = 1;
    private String id ,name ,nhom;
    private Float loi;

    public Product(String name, String nhom, Float mua, Float ban) {
        this.id = "MH" + String.format("%02d",cnt++);
        this.name = name;
        this.nhom = nhom;
        this.loi = ban - mua;
    }

    public Float getLoi() {
        return loi;
    }
    
    public String toString(){
        return id + " " + name + " " + nhom + " " + String.format("%.2f", loi);
    }
    
    public int compareTo(Product a){
        return -loi.compareTo(a.loi);
    }
    
    
    
    
}


public class JavaApplication2 {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner (new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Product> a = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String nhom = sc.nextLine();
            Float mua = Float.parseFloat(sc.nextLine());
            Float ban = Float.parseFloat(sc.nextLine());
            a.add(new Product(name,nhom,mua,ban));
        }Collections.sort(a);
        for(Product i : a) {
            System.out.println(i);
        }
    }

    
}