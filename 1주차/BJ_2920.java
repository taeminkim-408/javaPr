import java.util.Scanner;

public class BJ_2920 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String input;
        int [] score= new int[8];
        for(int i=0;i<8;i++){
            score[i]=scanner.nextInt();
        }
        boolean check1 = descending(score);
        boolean check2 = ascending(score);
        if(check1!=true&&check2!=true){
            System.out.println("mixed");
        }
    }

    public static boolean descending(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        System.out.println("descending");
        return true;
    }

    public static boolean ascending(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        System.out.println("ascending");
        return true;
    }


}
