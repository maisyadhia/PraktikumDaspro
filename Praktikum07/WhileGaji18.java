/**
 * WhileGaji18
 */
import java.util.Scanner;
public class WhileGaji18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur ;
        double gajiLembur, totalGajiLembur;
        String jabatan ;

        gajiLembur = 0;
        totalGajiLembur = 0;
        int i = 0 ;

        System.out.println("masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        while (i < jumlahKaryawan) {
            System.out.print("pilihan jabatan -direktur, manajer, karyawan");
            System.out.print("masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }else {
                System.out.println("jabatan invalid");
                i--;
                continue;
            }
            
            totalGajiLembur += gajiLembur;

        }
        System.out.println("total gaji lembur: " + totalGajiLembur);
    }
}