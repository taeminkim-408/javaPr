import java.util.Scanner;

public class BJ_5598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] clist = input.toCharArray();
        int ch =0;
        for(int i=0;i<input.length();i++){
            if(clist[i] >= 65 && clist[i] <= 90){
                if(clist[i] < 68){
                    clist[i] = (char)(clist[i]+23);
                }
                else{
                    clist[i] = (char)(clist[i]-3);
                }
                
                
            }
            System.out.print(clist[i]);
        }

    

    }
}
