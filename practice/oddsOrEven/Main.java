package oddsOrEven;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if( (a*b)%2 != 0 ){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
        scan.close();
    }
}