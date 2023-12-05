import java.util.Scanner;

/**
 * latihan
 */
public class latihan {

    public static void main(String[] args) {
        Scanner mai = new Scanner(System.in);

        String namaPelanggan, namaProduk;
        int kuantitas, totalkuantitas;
        double hargaProduk, diskon, totalHargaSblmDiskon, totalDiskonProduk, totalDiskonMember, totalhargaAkhir;
        boolean kartuMember;

        totalkuantitas = 0;
        totalHargaSblmDiskon = 0;
        totalDiskonProduk = 0;
        totalDiskonMember = 0;
        totalhargaAkhir = 0;

        System.out.print("nama pelanggan: ");
        namaPelanggan = mai.nextLine();

        System.out.print("punya kartu member? (ya/tidak): ");
        kartuMember = mai.nextLine().equalsIgnoreCase("ya");

        while (true) {
            System.out.print("nama produk: ");
            namaProduk = mai.nextLine();

            System.out.print("kuantitas: ");
            kuantitas = mai.nextInt();

            System.out.print("harga produk: ");
            hargaProduk = mai.nextDouble();

            System.out.print("masukkan jika ada diskon,jika tidak ada masukkan 0: ");
            diskon = mai.nextDouble();

            totalkuantitas += kuantitas;
            totalHargaSblmDiskon += (kuantitas * hargaProduk);

            totalDiskonProduk += (kuantitas * hargaProduk * diskon/100);
            mai.nextLine();

            System.out.print("apakah ada produk lain yang ingin dimasukkan? (ya/tidak): ");
            if (mai.nextLine().equalsIgnoreCase("tidak")) {
                break;
            }
        }
        if (kartuMember && totalHargaSblmDiskon >= 200000) {
            totalDiskonMember = totalHargaSblmDiskon * 0.1;
        }else if (kartuMember) {
            totalDiskonMember = totalHargaSblmDiskon * 0.05;
        }

        totalhargaAkhir = totalHargaSblmDiskon - totalDiskonMember - totalDiskonProduk;

        System.out.println("namaPelanggan: " + namaPelanggan );
        System.out.println("tipe member: " + (kartuMember ? "member" : "bukan member"));
        System.out.println("total kuantitas: " + totalkuantitas);
        System.out.println("total harga sebelum diskon: " + totalHargaSblmDiskon);
        System.out.println("total diskon member: " + totalDiskonMember);
        System.out.println("total diskon produk: " + totalDiskonProduk);
        System.out.println("total harga akhir: " + totalhargaAkhir);
    }
}