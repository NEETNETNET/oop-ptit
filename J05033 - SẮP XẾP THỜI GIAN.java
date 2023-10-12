package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.*;

class Time implements Comparable<Time>{
    private int h,m,s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }
    
    public String toString(){
        return h + " " + m + " " + s;
    }
    
    public int compareTo(Time a){
        int x = h * 3600 + m * 60 + s;
        int y = a.h * 3600 + a.m * 60 + a.s;
        return x - y;
    }
    
}
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Time> a = new ArrayList<>();
        while(t --> 0 ){
            Time x = new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
            a.add(x);
        }Collections.sort(a);
        for(Time i : a){
            System.out.println(i);
        }
            
    }
    
}

