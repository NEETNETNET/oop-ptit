package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.*;

class Product implements Comparable<Product>{
    private static int cnt = 1;
    private String ten, donVi,ma;
    private int mua,ban,lai;

    public Product(String ten, String donVi, int mua, int ban) {
        this.ten = ten;
        this.donVi = donVi;
        this.mua = mua;
        this.ban = ban;
        this.ma = "MH" + String.format("%03d",this.cnt++);
        this.lai = this.ban - this.mua;
    }
    
    public String toString(){
        return ma + " " + ten + " " + donVi + " " + mua + " " + ban + " " + lai;
    }
    
    public int compareTo(Product u){
        return u.lai - lai;
    }
}
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Product> a = new ArrayList<>();
        while(t --> 0 ){
            sc.nextLine();
            Product x = new Product(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()); 
            a.add(x);
        }Collections.sort(a);
        for(Product i : a){
            System.out.println(i);
        }
            
    }
    
}

