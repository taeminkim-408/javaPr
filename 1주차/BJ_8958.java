import java.util.Scanner;

public class BJ_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum=0;
        int oo=0;
        for(int i=0;i<input;i++){
            String check = scanner.next();
            for(int j=0;j<check.length();j++){
                if(check.charAt(j) == 'O'){
                    oo++;
                    sum=sum+ oo;
                }
                else{
                    oo=0;
                }
            }
            System.out.println(sum);
            oo=0;
            sum=0;
        }
    }
}
