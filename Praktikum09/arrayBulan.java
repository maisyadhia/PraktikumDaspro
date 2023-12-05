import java.util.Scanner;

public class arrayBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.print("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();

        if (nomorBulan >= 1 && nomorBulan <= 12) {
            String namaBulan = bulan[nomorBulan - 1];
            System.out.println("Bulan: " + namaBulan);
        } else {
            System.out.println("Nomor bulan tidak valid. Harap masukkan nomor bulan antara 1 hingga 12.");
        }
    }
}