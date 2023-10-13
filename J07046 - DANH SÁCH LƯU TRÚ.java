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


class Customer implements Comparable<Customer>{
    private static int cnt = 1;
    private String id,name,idRoom;
    private Long duration;

    public Customer(String name, String idRoom, String start, String finish) throws ParseException {
        this.name = name;
        this.idRoom = idRoom;
        this.id = "KH" + String.format("%02d", cnt++);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date a = formatter.parse(start);
        Date b = formatter.parse(finish);
        this.duration = (b.getTime() - a.getTime())/(1000L * 60 * 60 * 24);
        
    }

    public Long getDuration() {
        return duration;
    }
    
    public String toString(){
        return id + " " + name + " " + idRoom + " " + duration ;
    }
    
    public int compareTo(Customer a){
        return -duration.compareTo(a.duration);
    }

    
    
}


public class JavaApplication2 {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner (new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Customer> a = new ArrayList<>();
        while(t-->0){
            a.add(new Customer(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }Collections.sort(a);
        for(Customer i : a) {
            System.out.println(i);
        }
    }

    
}