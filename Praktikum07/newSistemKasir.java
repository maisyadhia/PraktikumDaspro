import java.util.Scanner;

public class newSistemKasir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaObat = { "Alprazolam tablet", "Benzatin benzil penisilin", "Clobazam tablet", 
                        "Deksametason", "Entromisin kaplet", "Flukonazol tablet","Glimepiride tablet",
                        "Hidrokortison krim","Ibu profen tablet","Kalsium laktat tablet" };    
        String[] kodeObat = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
        int[] kuantitas = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] hargaObat = { 120000, 150000, 125000, 265000, 115000, 290000, 110000, 95000, 30000, 70000 };
        boolean member = false;

        while (true) {
            System.out.println("Menu Kasir Apotek:");
            System.out.println("1. Inventaris");
            System.out.println("2. Transaksi");
            System.out.println("3. Cetak Struk");
            System.out.println("4. Selesai");
            System.out.print("Pilih menu (1/2/3/4): ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Daftar Obat : ");
                    System.out.printf("%-4s%-30s%-12s%-12s%-15s%n", "ID", "Nama Obat", "Kode Obat", "Kuantitas", "Harga per Unit");

                    for (int i = 0; i < namaObat.length; i++) {
                        System.out.printf("%-4d%-30s%-12s%-12d%-15d%n", i+1, namaObat[i], kodeObat[i], kuantitas[i], hargaObat[i]);
                    }
                    System.out.println("==========================================");
                    while(true) {
                        System.out.print("Masukkan kode obat: ");
                        sc.nextLine(); // Membuang karakter newline
                        String kode = sc.nextLine();
                        int index = -1;
                        for (int i = 0; i < kodeObat.length; i++) {
                            if (kodeObat[i].equalsIgnoreCase(kode)) {
                                index = i;
                                break;
                            }
                        }

                        if (index != -1) {
                            System.out.println("Nama Obat\t: " + namaObat[index]);
                            System.out.println("Kuantitas\t: " + kuantitas[index]);
                            System.out.println("Harga Obat\t: " + hargaObat[index]);
                        } else {
                            System.out.println("Kode obat tidak ditemukan.");
                        }
                        
                        System.out.print("Apakah Anda ingin searching data lagi? (ya/tidak): ");
                        String lanjut = sc.next();
                        // sc.nextLine(); 

                        if (lanjut.equalsIgnoreCase("tidak")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Obat : ");
                    System.out.printf("%-4s%-30s%-12s%-12s%-15s%n", "ID", "Nama Obat", "Kode Obat", "Kuantitas", "Harga per Unit");

                    for (int i = 0; i < namaObat.length; i++) {
                        System.out.printf("%-4d%-30s%-12s%-12d%-15d%n", i+1, namaObat[i], kodeObat[i], kuantitas[i], hargaObat[i]);
                    }
                    System.out.println("Transaksi:");
                    while (true) { 

                        System.out.print("Masukkan kode obat: ");
                        sc.nextLine();
                        String x = sc.nextLine();
            
                        boolean obatDitemukan = false;
                        int jumlah = 0;
                        double totalHarga = 0;
            
                        for (int i = 0; i < kodeObat.length; i++) {
                            if (kodeObat[i].equalsIgnoreCase(x)) {
                                System.out.println("Kode : " + kodeObat[i]);
                                System.out.println("Nama Obat : " + namaObat[i]);
                                System.out.println("Kuantitas : " + kuantitas[i]);
                                System.out.println("Harga : " + hargaObat[i]);
            
                                System.out.print("Jumlah obat yang dibeli: ");
                                jumlah = sc.nextInt();
            
                                int harga = hargaObat[i];
                                totalHarga = jumlah * harga;
            
                                System.out.println("Total harga : " + totalHarga);
                                obatDitemukan = true;
                                break;
                            }
                        }
            
                        if (!obatDitemukan) {
                            System.out.println("Obat tidak ditemukan!");
                            continue; 
                        } else {
                            System.out.print("Apakah Anda memiliki kartu member (ya/tidak)? ");
                            String memilikiKartu = sc.next();
            
                            if (memilikiKartu.equalsIgnoreCase("ya")) {
                                if (totalHarga >= 50000) {
                                    totalHarga -= 10000; 
                                    System.out.println("Anda mendapatkan diskon sebesar 10.000.");
                                } else {
                                    System.out.println("Anda tidak memenuhi syarat untuk mendapatkan diskon.");
                                }
                            }
            
                            System.out.println("Total harga setelah diskon: " + totalHarga);
            
                            double uangPelanggan = 0;
                            while (uangPelanggan < totalHarga) {
                                System.out.print("Masukkan uang yang diberi: ");
                                uangPelanggan = sc.nextDouble();
                                if (uangPelanggan < totalHarga) {
                                    System.out.println("Uang yang diberikan kurang, silakan coba lagi.");
                                }
                            }
            
                            double kembalian = uangPelanggan - totalHarga;
            
                            System.out.println("Kembalian : Rp " + kembalian);
                            System.out.println("Terimakasih Telah belanja!");
            
                            break; 
                        }
                    }
                    break;

                case 3:
                    System.out.println("Cetak Struk");
                    // Tambahkan logika untuk mencetak struk disini
                    break;

                case 4:
                    System.out.println("Terima kasih telah berbelanja di apotek kami!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1, 2, 3, atau 4.");
                    break;
            }
        }
    }
}