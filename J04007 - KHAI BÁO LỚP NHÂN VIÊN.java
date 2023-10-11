package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;
class Staff{
    private String mnv = "00001", name,sex,born,address,tax,date;

    public Staff(String name, String sex, String born, String address, String tax, String date) {
        this.name = name;
        this.sex = sex;
        this.born = born;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }


    
    
    public String toString(){
        return mnv + " " + name + " " + sex + " " + born + " " + address + " " + tax + " " + date;
    }   
    
    
    
}
public class JavaApplication2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String born = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String date = sc.nextLine();
        Staff a = new Staff(name, sex, born, address, tax, date);
        System.out.println(a);
    }
        
            
                    
            
                
        
        
        
    
}