import java.util.Scanner;

public class BJ_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] remainder = new int[10];
        int input;
        int sum=0;
        for(int i=0;i<10;i++){
            input = scanner.nextInt();
            remainder[i] = input%42;
            for(int j=0;j<i;j++){
                if(remainder[j]==remainder[i]){
                    sum++;
                    break;
                }
            }
        }
        scanner.close();
        System.out.print(10-sum);
        
    }
}
