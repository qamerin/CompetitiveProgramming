package SomeSums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total=0;

        for(int i=0;i<=n;i++){
            int val = i;
            int digitSum = 0;
            while(val > 0){
               digitSum = digitSum + (val%10);
               val=val/10;
            }
            if(digitSum >= a && digitSum <= b){
                total += i;
            }
        }
        System.out.println(total);
        
    }
    
}
