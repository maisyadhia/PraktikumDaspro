import java.util.Scanner;

public class ygbaru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jenis sekolah (SMA/MA/SMK): ");
            String jenisSekolah = input.nextLine();
            System.out.print("Masukkan nilai ujian masuk: ");
            int nilaiUjian = input.nextInt();
            System.out.print("Masukkan nilai penalaran matematika: ");
            int nilaiMatematika = input.nextInt();
            System.out.print("Masukkan nilai bahasa Inggris: ");
            int nilaiBahasaInggris = input.nextInt();

            if ((jenisSekolah.equals("SMA") || jenisSekolah.equals("MA")) && nilaiMatematika < 75) {
                System.out.println("Mahasiswa perlu mengikuti matrikulasi Kalkulus 1");
            }

            if (jenisSekolah.equals("SMA") || jenisSekolah.equals("MA")) {
                System.out.println("Mahasiswa perlu mengikuti matrikulasi Praktikum Rangkaian Listrik");
            } else if (jenisSekolah.equals("SMK") && nilaiUjian < 70) {
                System.out.println("Mahasiswa perlu mengikuti matrikulasi Praktikum Rangkaian Listrik");
            }

            if (nilaiBahasaInggris < 65) {
                System.out.println("Mahasiswa perlu mengikuti matrikulasi Bahasa Inggris Dasar");
            }

            System.out.println("Apakah Anda ingin mengecek mahasiswa lain? (ya/tidak)");
            String option = input.next();
            if (option.equals("tidak")) {
                break;
            }
            input.nextLine();
        }
        input.close();
    }
}
