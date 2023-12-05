/**
 * KasirApotek18
 */
import java.util.Scanner;
public class KasirApotek18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kuantitas;
        String namaObat, kartuMember,ya ,tidak;
        double harga, totalHarga, kembalian, jumlahBayar;

        System.out.println("Nama Obat: ");
        namaObat = sc.nextLine();
        System.out.println("Kuantitas yang dibeli: ");
        kuantitas = sc.nextInt();
        System.out.println("Harga obat: ");
        harga = sc.nextDouble();
        System.out.println("Jumlah uang yang dibayarkan: ");
        jumlahBayar = sc.nextDouble();
        System.out.println("apakah punya kartu member");

        if (ya) {
            System.out.println(totalHarga = totalHarga - 50000);
        }else {}

        
        //totalHarga = harga*kuantitas;
        //System.out.println("Total harga: " + totalHarga);

        //if (totalHarga >=150000) {
        //totalHarga = totalHarga-5000;
        //}else {}

        //kembalian = jumlahBayar - totalHarga;
        //System.out.println("kembalian : " + kembalian);



    }
}