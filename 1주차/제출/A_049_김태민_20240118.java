import java.util.Scanner;

public class BJ_4659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean output;
        while (true) {
            String input = scanner.next();
            if (input.equals("end")) {
                break;
            }
            output = check(input);
            if (!output) {
                System.out.println("<"+input+">" + " is not acceptable.");
            } else {
                System.out.println("<"+input + ">"+" is acceptable.");
            }
        }
    }

    public static boolean check(String str) {
        char[] clist = str.toCharArray();

        if (str.length() > 20 || str.length() < 1) {
            return false; // 크기포함여부
        }

        if (!moeum(str)) {
            return false; // 모음 포함
        }

        for (int i = 2; i < str.length(); i++) {
            if (moeum2(clist[i])) {
                if (moeum2(clist[i - 2]) && moeum2(clist[i - 1])) {
                    return false;
                }
            }
                else {
                    if (!moeum2(clist[i - 2]) && !moeum2(clist[i - 1])) {
                        return false;
                    }
                }
            
        }

        for (int i = 1; i < str.length(); i++) {
            if (clist[i] == clist[i - 1]) {
                if (!(clist[i] == 'e' && clist[i - 1] == 'e') && !(clist[i] == 'o' && clist[i - 1] == 'o')) {
                    return false;
                }
            }
        }
        

        return true;
    }

    public static boolean moeum(String str) {
        return (str.contains("a") || str.contains("e") || str.contains("o") || str.contains("u") || str.contains("i"));
    }

    public static boolean moeum2(char str) {
        return (str == 'a') || (str == 'e') || (str == 'i') || (str == 'o') || (str == 'u');
    }
}
