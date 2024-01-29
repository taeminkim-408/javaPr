import java.util.Scanner;

public class B_11721 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
        for(int i = 0; i < input.length(); i++){
        System.out.print(input.charAt(i));
        if(i%10==9){
            System.out.println();
        }
    }

    }
    
}
