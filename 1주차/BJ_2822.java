
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ_2822 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[8][2];
    int[] num = new int[5];
    int sum=0;
        for(int i=0;i<8;i++){
            array[i][0] = scanner.nextInt();
            array[i][1] = i;
        }
        Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return b[0] - a[0];
			}
		});
        for(int i=0; i< 5; i++) {
			sum += array[i][0];
			num[i] = array[i][1]+1;
		}
        Arrays.sort(num);

		System.out.println(sum);
		
		for(int i=0; i<5; i++) {
			System.out.print(num[i] + " ");
		}


    }



}
