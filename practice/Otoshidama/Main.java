package Otoshidama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        boolean found=false;
        for(int a=0;a<N;a++){
            for(int b=0;b<N;b++){
                for(int c=0;c<N;c++){
                    int total=a*10000+b*5000+c*1000;
                    if(total==Y && a+b+c==N ){
                        System.out.println(a+" "+ b +" "+ c);
                        found = true;
                    }
                }
            }
        }
        if(!found){
            System.out.println(-1+" "+ -1 +" "+ -1);
        }
    }
}
