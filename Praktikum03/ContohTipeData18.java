/**
 * ContohTipeData18
 */
public class ContohTipeData18 {

    public static void main(String[] args) {
        char golonganDarah = 'A';
        short jumlahPenduduk = 1000;
        float suhu = 36;
        double berat = 0.987654321;
        double jarak = 4;
        long saldo = 15000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t: " + (byte)golonganDarah);
        System.out.println("Jarak\t\t: " + jarak);
        System.out.println("Jumlah Penduduk\t:" + jumlahPenduduk);
        System.out.println("Suhu\t\t: " + suhu);
        System.out.println("Berat\t\t: " + (float)berat);
        System.out.println("Saldo\t\t:" + saldo);
        System.out.println("Angka desimal\t: " + angkaDesimal);
    }
}