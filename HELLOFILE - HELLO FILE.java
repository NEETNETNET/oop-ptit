package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JavaApplication2 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner nhap = new Scanner(new File("Hello.txt"));
        while (nhap.hasNext())
            System.out.println(nhap.nextLine());
    }    
    
}