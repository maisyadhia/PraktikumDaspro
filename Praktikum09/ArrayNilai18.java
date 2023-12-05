/**
 * ArrayNilai18
 */
import java.util.Scanner;
public class ArrayNilai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];
        int nilaiTertinggi, nilaiTerendah, jumlahLulus, jumlahTidakLulus, nilaiTotal;
        double rataRata;

        jumlahLulus = 0;
        jumlahTidakLulus = 0;
        nilaiTotal = 0;
        

        for (int i = 0; i< nilaiAkhir.length; i++) {
            System.out.print("masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            nilaiTotal += nilaiAkhir[i];
        }

        rataRata =  nilaiTotal / nilaiAkhir.length;
        System.out.println("Nilai rata-rata: " + rataRata);

        nilaiTertinggi = nilaiAkhir[0];
        nilaiTerendah = nilaiAkhir[0];
        for (int i = 1; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
            }
        }
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        for (int i = 0; i< 10; i++) {
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
                System.out.println("mahasiswa ke-" + (i+1) + " lulus " );
            }else {
                jumlahTidakLulus++;
                System.out.println("mahasiswa ke-" + (i+1) + " tidak lulus " );
            }
        }

        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
    }
}