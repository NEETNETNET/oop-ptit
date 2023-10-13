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


class LoaiPhong implements Comparable<LoaiPhong>{
    private String line,name;

    public LoaiPhong(String line) {
        this.line = line;
        this.name = line.split("\\s+")[1];
    }
    
    public String getName() {
        return name;
    }
    
    public String toString(){
        return line;
    }
    
    public int compareTo(LoaiPhong a){
        return name.compareTo(a.name);
    }
    
}


public class JavaApplication2 {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }

    
}

