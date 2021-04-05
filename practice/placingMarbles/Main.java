package placingMarbles;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String num = sc.nextLine();
        int cnt=0;
        for(int i=0;i<num.length();i++){
             if(num.charAt(i)=='1') cnt++;
        }
        System.out.println(cnt);
    }
}
