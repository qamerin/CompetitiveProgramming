package CardGameforTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A= new Integer[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }

        Arrays.sort(A,Collections.reverseOrder());
        System.out.println(Arrays.asList(A));

        int sumA=0;
        int sumB=0;
        for(int i=0;i<A.length;i++){
            if(i%2==0){
                sumA += A[i];
            }else{
                sumB += A[i];
            }
        }
        System.out.println(sumA - sumB);
        sc.close();
    }
}
