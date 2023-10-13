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
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Product implements Comparable<Product>{
    private String id ,name ,han;
    private int gia;

    public Product(String id, String name, int gia,String han ) {
        this.id = id;
        this.name = name;
        this.han = han;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public int getGia() {
        return gia;
    }

    public String toString(){
        return id + " " + name + " " + gia + " " + han;
    }
    
    public int compareTo(Product a){
        if(a.gia == gia) return id.compareTo(a.id);
        return a.gia - gia;
    }
    
}


public class JavaApplication2 {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner (new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Product> a = new ArrayList<>();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            String han = sc.nextLine();
            a.add(new Product(id,name,gia,han));
        }Collections.sort(a);
        for(Product i : a) {
            System.out.println(i);
        }
    }

    
}