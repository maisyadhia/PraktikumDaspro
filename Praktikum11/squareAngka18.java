import java.util.Scanner;

public class squareAngka18 {
    public static void main(String[] args) {
        Scanner mai = new Scanner(System.in);

        System.out.print("Masukkan nilai n (n harus ganjil dan n > 2): ");
        int n = mai.nextInt();

        if (n % 2 == 0 || n <= 2) {
            System.out.println("Input harus ganjil dan lebih besar dari 2.");
        } else {
            if (n <= 9) {
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                                System.out.print(n + " ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                    System.out.println();
                }
            } else {
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                                System.out.print(n + " ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                    System.out.println();
                }
            }
        }
    }
}
    