/**
 * ContohVariabel18
 */
public class ContohVariabel18 {

    public static void main(String[] args) {
        String salahSatuHobiKuAdalah = "Bernyanyi";
        boolean isMerdu = true;
        char jenisKelamin = 'P';
        byte umurSayaSekarang = 18;
        double ipk = 4, tinggi = 1.75;

        System.out.println(salahSatuHobiKuAdalah);
        System.out.println("Apakah merdu? " + isMerdu);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", umurSayaSekarang, tinggi));

    }
}