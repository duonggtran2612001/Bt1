import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        final int NUM_COUNT = 5; // Số lượng số nguyên cần nhập
        int sum = 0; // Biến tích lũy để lưu trữ tổng các số
        Scanner scanner = new Scanner(System.in);

        // Nhập 5 số nguyên từ bàn phím
        for (int i = 0; i < NUM_COUNT; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number; // Cộng dồn vào biến tổng
        }

        // Tính giá trị trung bình, ép kiểu để có kết quả chính xác
        double average = (double) sum / NUM_COUNT;

        // Xuất kết quả
        System.out.println("Giá trị trung bình của 5 số nguyên là: " + average);

        scanner.close();
    }
}
