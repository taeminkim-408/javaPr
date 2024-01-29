import java.util.Scanner;

public class BJ_10828 {
    public static int[] stack;
    public static int size =0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i=0;i<input;i++){
            String input2 = scanner.next();
            switch (input2) {
                case "push":
                    int input3 = scanner.nextInt();
                    stack[size] = input3;
                    size ++;
                    break;
            
                default:
                    break;
            }

        }
    }

}
