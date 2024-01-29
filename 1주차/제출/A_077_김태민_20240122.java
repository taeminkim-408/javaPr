import java.util.Arrays;
import java.util.Scanner;

public class BJ_2693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int [][]arr = new int[input][10];
        for(int i=0;i<input;i++){
            for(int j=0;j<10;j++){
                arr[i][j]= scanner.nextInt();
            }
            Arrays.sort(arr[i]);
        }
        
        
        for(int i=0;i<input;i++){
            System.out.println(arr[i][7]);
        }
    }

}
