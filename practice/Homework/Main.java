package Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a =new int[M];
        int total = 0;
        for(int i=0;i<M;i++){
           a[i] = sc.nextInt();
           total += a[i];
        }
        int asoberu = N - total;
        if(asoberu < 0){
            System.out.print(-1);
        }else{
            System.out.print(asoberu);
        }
        sc.close();
    }
    
}
