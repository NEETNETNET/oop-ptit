package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private Set<String> s;
    
    public WordSet(String fileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fileName));
        s = new TreeSet<>();
        while(sc.hasNext()){
            s.add(sc.next().toLowerCase());
        }
    }
    
    public String toString(){
        String k = "";
        for(String i : s){
            k += i + "\n";
        }return k;
    }
}
public class JavaApplication2 {

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

