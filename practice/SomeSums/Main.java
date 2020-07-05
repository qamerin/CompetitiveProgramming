package SomeSums;

import java.util.*;
public class Main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    int total=0;
    for(int i=1; i<= N;i++){
        int val = i;
        int digitSum=0;
        while (val > 0){
            digitSum += val%10; 
            val=val/10;
        }
        if(digitSum >= A && digitSum <= B){
            total+=i;
        }
    }
    System.out.println(total);
    sc.close();
       
   }
}