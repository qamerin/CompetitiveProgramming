package Coins;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int total = sc.nextInt();

        int count=0;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                for(int k=0;k<=c;k++){
                    int sum =500*i + 100*j + 50*k;
                    if(sum == total) count++;
                }
            }
        }
        System.out.println(count);
        
    }
    
}
