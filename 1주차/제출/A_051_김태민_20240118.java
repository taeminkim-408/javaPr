import java.util.Scanner;

public class BJ_5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count =0;
        for(int i=0;i<input.length();i++){
            char str = input.charAt(i);
            switch (str) {
                case 'A': case 'C': case 'B':
                    count= count+3;
                    break;
                case 'D': case 'E': case 'F':
                    count= count+4;
                    break;
                case 'G': case 'H': case 'I':
                    count= count+5;
                break;
                case 'J': case 'K': case 'L':
                    count= count+6;
                    break;
                case 'N': case 'M': case 'O':
                    count= count+7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    count= count+8;
                    break;
                case 'T': case 'U': case 'V':
                    count= count+9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    count= count+10;
                    break;
                default:
                    break;
            }
        }
        System.out.print(count);

    }

}
