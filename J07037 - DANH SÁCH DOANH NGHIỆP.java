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


class Company implements Comparable<Company>{
    private String id,name;
    private int ssv;
    
    public Company(String id, String name, int ssv) {
        this.id = id;
        this.name = name;
        this.ssv = ssv;
    }

    public String getId() {
        return id;
    }
    
    public String toString(){
        return id + " " + name + " " + ssv;
    }
    
    public int compareTo(Company a){
        return id.compareTo(a.id);
    }
    
}


public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<Company> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            Company x = new Company(id,name,stc);
            a.add(x);
        }Collections.sort(a);
        for (Company i : a){
            System.out.println(i);
        }
        
    }

    
}

