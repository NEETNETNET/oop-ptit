package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;
class Student{
    private String name, date;
    private double s1,s2,s3;

    public Student(String name, String date, double s1, double s2, double s3) {
        this.name = name;
        this.date = date;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    
    public String toString(){
        return name + " " + date + " " + String.format("%.1f", s1+s2+s3);
    }

    
    
    
}
public class JavaApplication2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student x = new Student(sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
        
            
                    
            
                
        
        
        
    
}