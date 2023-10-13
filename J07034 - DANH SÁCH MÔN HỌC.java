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


class Subject implements Comparable<Subject>{
    private String id,name;
    private int stc;
    
    public Subject(String id, String name, int stc) {
        this.id = id;
        this.name = name;
        this.stc = stc;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return id + " " + name + " " + stc;
    }
    
    public int compareTo(Subject a){
        return name.compareTo(a.name);
    }
    
}


public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            Subject x = new Subject(id,name,stc);
            a.add(x);
        }Collections.sort(a);
        for (Subject i : a){
            System.out.println(i);
        }
        
    }

    
}

