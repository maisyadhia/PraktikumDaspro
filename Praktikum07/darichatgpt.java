import java.util.Scanner;

public class darichatgpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Program Penghitung Pembelian");

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Apakah pelanggan adalah member? (ya/tidak): ");
        String memberStatus = scanner.nextLine();
        boolean isMember = memberStatus.equalsIgnoreCase("ya");

        int totalItem = 0;
        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;

        boolean tambahProduk = true;

        while (tambahProduk) {
            System.out.print("Masukkan nama produk: ");
            String namaProduk = scanner.next();

            System.out.print("Masukkan kuantitas: ");
            int kuantitas = scanner.nextInt();

            System.out.print("Masukkan harga satuan: ");
            double hargaSatuan = scanner.nextDouble();

            System.out.print("Masukkan diskon (%): ");
            double diskonPersen = scanner.nextDouble();

            double subTotal = kuantitas * hargaSatuan;
            double diskonProduk = subTotal * (diskonPersen / 100);

            totalItem += kuantitas;
            totalHargaSebelumDiskon += subTotal;
            totalDiskon += diskonProduk;

            System.out.print("Apakah Anda ingin menambah produk lagi? (ya/tidak): ");
            String tambah = scanner.next();
            tambahProduk = tambah.equalsIgnoreCase("ya");
        }

        double totalAkhir;
        if (isMember && totalHargaSebelumDiskon >= 200000) {
            double diskonMember = totalHargaSebelumDiskon * 0.1;
            totalAkhir = totalHargaSebelumDiskon - totalDiskon - diskonMember;
        } else if (isMember) {
            double diskonMember = totalHargaSebelumDiskon * 0.05;
            totalAkhir = totalHargaSebelumDiskon - totalDiskon - diskonMember;
        } else {
            totalAkhir = totalHargaSebelumDiskon - totalDiskon;
        }

        System.out.println("\n======= Ringkasan Pembelian =======");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Tipe Pelanggan: " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total Item: " + totalItem);
        System.out.println("Total Harga Sebelum Diskon: " + totalHargaSebelumDiskon);
        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Total yang harus dibayar: " + totalAkhir);
    }
}
