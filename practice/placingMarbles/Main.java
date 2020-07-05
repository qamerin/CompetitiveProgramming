package placingMarbles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();

        String[] strArray = in.split("");
        int cnt = 0;
        for(String str :strArray){
            if(str.equals("1")){
                cnt ++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}