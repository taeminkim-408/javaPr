
import java.util.Scanner;

public class BJ_2953 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int max=0;
        int maxvalue=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                sum += scanner.nextInt();
            }
            if(sum>max){
                max=sum;
                maxvalue = i+1;
            }
            sum=0;
        }
        System.out.printf("%d %d",maxvalue, max);
    }
}
