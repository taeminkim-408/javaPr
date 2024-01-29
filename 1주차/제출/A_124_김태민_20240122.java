import java.util.Scanner;

public class BJ_1615 {
    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print(arithmetic_sequence(in.nextInt()));
		in.close();
	}
	public static int arithmetic_sequence(int num) {
		int count = 0;
		if (num < 100) {
			return num;
		}
		else {
			count = 99;
			for (int i = 100; i <= num; i++) {
				int bak = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				if ((bak - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}
