package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;
class Point {
    private double x;
    private double y;
    private double distance;
    
    public Point() {
        x = 0;
        y = 0;
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
    
    public double getY(){
        return y;
    }
    
    double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x, 2)+Math.pow(y-p.y, 2));
    }
    
    double distance(Point p,Point q){
        return Math.sqrt(Math.pow(q.x-p.x, 2)+Math.pow(q.y-p.y, 2));
    }
    
    public void distance_value(double distance) {
		this.distance = distance;
    }
    
    public String toString(){
        return String.format("%.4f", distance);
    }
    
}
public class JavaApplication2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            double distance = p1.distance(p2);
            p1.distance_value(distance);
            System.out.println(p1);
        }
    }
        
            
                    
            
                
        
        
        
    
}