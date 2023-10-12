package javaapplication1;

/**
 *
 * @author Tran Khanh
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Student{
    private String msv = "B20DCCN001",name,clas,born;
    private double gpa ;

    public Student(String name, String clas, String born, double gpa) {
        this.name = name;
        this.clas = clas;
        this.born = born;
        this.gpa = gpa;
    }
    
    public String formatDob() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(born);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }
    
    public String toString(){
        return msv + " " + name + " " + clas + " " + formatDob() + " " + String.format("%.2f",gpa);
    }
    
}
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
        System.out.println(a);
    }
    
}

