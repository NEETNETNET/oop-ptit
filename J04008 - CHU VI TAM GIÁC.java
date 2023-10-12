package javaapplication1;

/**
 *
 * @author Tran Khanh
 */
import java.util.*;

class Point{
    private double x,y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
    } 
    
    public double distance(Point p1,Point p2){
        return Math.sqrt(Math.pow(p2.x-p1.x, 2) + Math.pow(p1.y-p2.y, 2));
    }
    
    public String tostring(){
        return x + " " + y;
    }
}
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c= p3.distance(p1);
            if (a + b > c && b + c > a && a + c > b) System.out.printf("%.3f\n",a+b+c);
            else System.out.println("INVALID");
        }
    }
    
}
