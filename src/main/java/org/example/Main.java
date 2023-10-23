import java.util.Scanner;

public class Main {
    public static boolean prim(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr întreg: ");
        int num = scanner.nextInt();

        if (prim(num)) {
            System.out.println(num + " este un număr prim.");
        } else {
            System.out.println(num + " nu este un număr prim.");
        }
    }
}
