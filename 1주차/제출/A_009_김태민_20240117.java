    import java.util.Scanner;

    public class BJ_4343 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int testCases = scanner.nextInt();
    
            for (int i = 0; i < testCases; i++) {
                int students = scanner.nextInt();
                int[] scores = new int[students];
                int sum = 0;
    
                for (int j = 0; j < students; j++) {
                    scores[j] = scanner.nextInt();
                    sum += scores[j];
                }
    
                float average = (float) sum / students;
                int countAboveAverage = 0;
    
                for (int j = 0; j < students; j++) {
                    if (scores[j] > average) {
                        countAboveAverage++;
                    }
                }
    
                float ratio = (float) countAboveAverage / students * 100;
                System.out.printf("%.3f%%\n", ratio);
            }
        }
    }
