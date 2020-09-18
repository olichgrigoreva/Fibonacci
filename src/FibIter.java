import java.util.Scanner;

public class FibIter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int num = scanner.nextInt();
        int f0 = 0, f1 = 1;
        int sum;

        System.out.print("\n" + f0 + " " + f1 + " ");
        for (int i = 2; i < num; i++) {
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
            System.out.print(sum + " ");
        }
    }
}
