package WelcometoAtCoder;

import java.util.Scanner;
public class Main {

     public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;

        String txt = sc.next();
        System.out.println(sum +" "+ txt);
        sc.close();
     }
}