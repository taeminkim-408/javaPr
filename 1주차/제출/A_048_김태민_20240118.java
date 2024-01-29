import java.util.Scanner;
public class BJ_1316 {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int input = scanner.nextInt();
        int count =0;
        for(int i = 0; i < input; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.print(count);
    
    }

    public static boolean check(){
        boolean[] check = new boolean[26];
        int prev =0;
        String str = scanner.next();
        for(int i=0;i<str.length();i++){
            int now =str.charAt(i);
            if(prev != now){
                if( check[now -'a']==false){
                    check[now -'a']= true;
                    prev=now;
                }
                else return false;

            }
            else{
                continue;
            }

        }
        return true;
    }
}
