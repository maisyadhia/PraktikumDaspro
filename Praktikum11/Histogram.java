import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah bilangan bulat
        System.out.print("Masukkan jumlah bilangan bulat: ");
        int jumlahAngka = scanner.nextInt();

        // Membuat array untuk menyimpan bilangan bulat
        int[] bilangan = new int[jumlahAngka];

        // Meminta pengguna untuk memasukkan bilangan bulat
        System.out.println("Masukkan bilangan bulat:");
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = scanner.nextInt();
        }

        // Menampilkan histogram
        System.out.println("\nHistogram:");

        for (int i = 0; i < jumlahAngka; i++) {
            // Menampilkan bilangan
            System.out.print(bilangan[i] + ": ");

            // Menampilkan '*' sebanyak frekuensi bilangan
            for (int j = 0; j < bilangan[i]; j++) {
                System.out.print('*');
            }

            System.out.println
            (); // Pindah baris setelah setiap baris histogram
        }

        scanner.close();
    }
}
