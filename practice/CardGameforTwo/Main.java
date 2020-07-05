package CardGameforTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int N = sc.nextInt();
        Integer[] intArray = new Integer[N];

        for(int i=0;i<intArray.length;i++){
            intArray[i] = sc.nextInt();
        }
        Arrays.sort(intArray,Collections.reverseOrder());

        int A = 0;
        int B = 0;
        int count = 1;
        for(int j:intArray){
            if(count%2==1){
                A += j;
            }else{
                B += j;
            }
            count++;
        }
        int diff = A - B;
        System.out.println(diff);
        sc.close();
        
    }
}