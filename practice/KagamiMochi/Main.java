package KagamiMochi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set map = new HashSet<>();

        for(int i=0;i<N;i++){
           int val = sc.nextInt(); 

           map.add(val);
        }
        System.out.println(map.size());
        sc.close();
    }
    
}
