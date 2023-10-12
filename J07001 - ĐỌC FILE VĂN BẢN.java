package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class javaApplication2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}

