    import java.util.Scanner;

    public class BJ_1159 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            char[] firstChars = new char[input];
            int sum = 0;
            int check=0;
            for (int i = 0; i < input; i++) {
                String names = scanner.nextLine();
                firstChars[i] = names.charAt(0);
            }

            for (int i = 0; i < input; i++) {
                for (int j = 0; j < i; j++) {
                    if (firstChars[j] == firstChars[i]) {
                        sum++;
                    }
                }
                if(sum>=5){
                    check=1;
                }
                sum=0;
            }
            if(check==0){
                System.out.println("PREDAJA");
            }
            else {
                System.out.println("bk");
            }
        }
    }
