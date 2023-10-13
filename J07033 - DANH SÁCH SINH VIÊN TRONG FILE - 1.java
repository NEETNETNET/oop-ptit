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


class Student implements Comparable<Student>{
    private String id,name,clas,mail;

    public Student(String id, String name, String clas, String mail) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.mail = mail;
        normalize();
    }

    public String getId() {
        return id;
    }
    
    private void normalize(){
        String s = "";
        String[] list = name.trim().split("\\s+");
        for(int i =0;i<list.length;i++){
            s += list[i].substring(0,1).toUpperCase() + list[i].substring(1).toLowerCase();
            if(i!=list.length - 1) s+=" ";
        }name = s;
    }
    
    public String toString(){
        return id + " " + name + " " + clas + " " + mail;
    }
    
    public int compareTo(Student a){
        return id.compareTo(a.id);
    }
    
}


public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Student x = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }Collections.sort(a);
        for (Student i : a){
            System.out.println(i);
        }
        
    }

    
}

