import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Masukkan 10 elemen array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Elemen-elemen array secara terbalik:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        
    }
}