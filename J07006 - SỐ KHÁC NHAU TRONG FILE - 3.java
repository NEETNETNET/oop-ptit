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
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;
public class JavaApplication2 {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) oi.readObject();
        int[] cnt = new int[1000];
        for (Integer i : list) {
            cnt[i]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}

