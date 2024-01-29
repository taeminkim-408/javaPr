
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ_10814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
        String[][] array = new String[input][2];
        for(int i=0;i<input;i++){
            array[i][0]= scanner.next();
            array[i][1]= scanner.next();
        }
        Arrays.sort(array, new Comparator<String[]>() {
		
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		
		for(int i=0;i<input;i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
    }
}
