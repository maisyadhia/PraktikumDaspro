/**
 * KasirApotek18
 */
import java.util.Scanner;
public class sistemKasir17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kuantitas;
        String namaObat, kartuMember;
        double harga, totalHarga, kembalian, jumlahBayar, diskon;

        System.out.println("Nama Obat: ");
        namaObat = sc.nextLine();
        System.out.println("Kuantitas yang dibeli: ");
        kuantitas = sc.nextInt();
        System.out.println("Harga obat: ");
        harga = sc.nextDouble();
        System.out.println("Jumlah uang yang dibayarkan: ");
        jumlahBayar = sc.nextDouble();
        System.out.println("apakah punya kartu member: ");
        kartuMember = sc.nextLine();

        if (kartuMember.equalsIgnoreCase("ya")) {
            if (jumlahBayar >= 50000) {
                diskon = 5000;
            } else {}
        }else {
            if (jumlahBayar >= 150000) {
                diskon = 5000;
            } else {}
        }

        //totalHarga = totalHarga - diskon;
        //System.out.println("total yang harus dibayar");
        
        //totalHarga = harga*kuantitas;
        //System.out.println("Total harga: " + totalHarga);

        //if (totalHarga >=150000) {
        //totalHarga = totalHarga-5000;
        //}else {}

        //kembalian = jumlahBayar - totalHarga;
        //System.out.println("kembalian : " + kembalian);



    }
}