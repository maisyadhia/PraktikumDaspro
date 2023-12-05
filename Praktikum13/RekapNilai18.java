/**
 * RekapNilai18
 */
import java.util.Scanner;
public class RekapNilai18 {
    
    static int[][] dataNilai;
    static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Budi", "Ali"};
    static int jumlahMinggu = 3;
    static int jumlahMahasiswa = 5;

    public static void main(String[] args) {
        inputDataNilai();
        tampilkanDataNilai();
        cariNilaiTerbaik();
    }

    static void inputDataNilai() {
        Scanner scanner = new Scanner(System.in);
        dataNilai = new int[jumlahMahasiswa][jumlahMinggu];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data nilai untuk mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu " + (j + 1) + ": ");
                dataNilai[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilkanDataNilai() {
        System.out.println("\nData Nilai Mahasiswa:");
        System.out.println("=======================================");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Mahasiswa", "Minggu 1", "Minggu 2", "Minggu 3");
        System.out.println("=======================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.printf("%-10d", dataNilai[i][j]);
            }
            System.out.println();
        }
    }

    static void cariNilaiTerbaik() {
        System.out.println("\nNilai Terbaik Setiap Minggu:");
        System.out.println("======================================");
        
        for (int j = 0; j < jumlahMinggu; j++) {
            int nilaiTerbaik = dataNilai[0][j];
            String mahasiswaTerbaik = namaMahasiswa[0];

            for (int i = 1; i < jumlahMahasiswa; i++) {
                if (dataNilai[i][j] > nilaiTerbaik) {
                    nilaiTerbaik = dataNilai[i][j];
                    mahasiswaTerbaik = namaMahasiswa[i];
                }
            }

            System.out.println("Minggu " + (j + 1) + ": Mahasiswa " + mahasiswaTerbaik + " dengan nilai " + nilaiTerbaik);
        }
    }
}