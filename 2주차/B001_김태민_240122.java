import java.util.*;

public class B001_김태민_240122 {
    static int virus[][];
    static boolean check[][];



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int input2 = scanner.nextInt();
        virus = new int[input+1][input+1];
        visit = new boolean[n+1];

        for(int i=0;i<input2;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            virus[a][b] = virus[b][a] =1;
        }
    }
}
