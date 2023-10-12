package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaApplication2 {

    public static void main(String[] args) throws IOException,FileNotFoundException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] cnt = new int[1000];
        for (int i = 0; i < 100000; i++) {
            cnt[dis.readInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}

