package ShiftOnly;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j[] = new int[i];

        for(int k = 0; k< j.length;k++){
            j[k] = sc.nextInt();
        }

        for(int sum=0;;sum++){
            for(int l=0;l<i;l++){
                if(j[l]%2>0){System.out.println(sum);return;}
                j[l]/=2;
            }
        }
   } 
}