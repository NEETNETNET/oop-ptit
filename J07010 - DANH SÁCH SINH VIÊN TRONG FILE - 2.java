package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

class Student {
    private static int cnt = 1;
    private String name,clas,born,id;
    private double gpa;

    public Student(String name, String clas, String born, double gpa) throws ParseException {
        this.name = name;
        this.clas = clas;
        this.gpa = gpa;
        this.id = " B20DCCN" + String.format("%03d", cnt++);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.born = formatter.format(formatter.parse(born));
    }
    
    public String toString(){
        return id + " " + name + " " + clas + " " + born + " " + String.format("%.2f",gpa);
    }
    
    
}
public class JavaApplication2 {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String born = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            Student a = new Student(name,clas,born,gpa);
            System.out.println(a);
        }
    }
}

