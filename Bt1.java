import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        final int NUM_COUNT = 5;
        int sum = 0; 
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM_COUNT; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number; 
        }
        double average = (double) sum / NUM_COUNT;
        System.out.println("Giá trị trung bình của 5 số nguyên là: " + average);

        scanner.close();
    }
}
