import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ_2217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
        Integer arr[] = new Integer[input];
        int sum =0;
        int check;

        for(int i=0;i<input;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int j=0;j<arr.length;j++){
            check = arr[j]*(j+1);
            if(check>sum){
                sum =check;
            }
        }
        System.out.println(sum);
    }
    
}
