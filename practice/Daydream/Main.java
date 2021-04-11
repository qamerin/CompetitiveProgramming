package Daydream;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tArray = {"dream","dreamer","erase","eraser"};
        String S = sc.nextLine();

        S = S.replaceAll(tArray[3], "");
        S = S.replaceAll(tArray[2], "");
        S = S.replaceAll(tArray[1], "");
        S = S.replaceAll(tArray[0], "");
        if(S.equals("")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

