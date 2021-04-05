package ShiftOnly;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  x = Integer.parseInt(sc.nextLine()); 
        String y = sc.nextLine(); 
        String[] data= y.split(" ",0);

        int[] intData = new int[x];
        for(int j=0;j<x;j++){
            intData[j] =Integer.parseInt(data[j]);
        }
        boolean check = false;

        int cnt=0;
        while(true){
            for(int k=0;k<intData.length;k++){
                if(intData[k]%2==1){
                    check = true;
                }
            }
            if(check) break;
            for(int l=0;l<intData.length;l++){
                intData[l] = intData[l]/2;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}