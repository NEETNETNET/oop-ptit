package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class JavaApplication2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] cnt = new int[1001];
        while(sc.hasNext()){
            int n = sc.nextInt();
            cnt[n] ++;
        }
        for (int i = 0;i<1001;i++){
            if(cnt[i] > 0){
                System.out.printf("%d %d\n",i,cnt[i]);
            }
        }
    }
}

