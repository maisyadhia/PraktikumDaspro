import java.util.Scanner;

public class HistogramSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            // Menampilkan spasi sebelum karakter '*'
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Menampilkan karakter '*' sesuai dengan baris ke-i
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }

        scanner.close();
    }
}
