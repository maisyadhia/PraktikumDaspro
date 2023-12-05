import java.util.Scanner;

/**
 * uts
 */
public class uts {

    public static void main(String[] args) {
        Scanner mai = new Scanner(System.in);

        String namaSiswa, kategori, kelasMatrikulasi;
        int nimMahasiswa;
        double nilaiRataRata, nilaiSkolastik, nilaiPenalaranMat, nilaiBahasaInggris;
        boolean selesai = false;

        nilaiRataRata = 0;

        
        while (!selesai) {
            System.out.print("Nama Siswa: ");
            namaSiswa = mai.nextLine();

            System.out.print("Masukkan NIM: ");
            nimMahasiswa = mai.nextInt();

            mai.nextLine();
            System.out.print("Kategori SLTA (SMA/SMK/MA): ");
            kategori = mai.nextLine();
            

            System.out.print("masukkan nilai Skolastik: ");
            nilaiSkolastik = mai.nextDouble();

            System.out.print("masukkan nilai penalaran matematika: ");
            nilaiPenalaranMat = mai.nextDouble();

            System.out.print("masukkan nila literasi bahasa inggris: ");
            nilaiBahasaInggris = mai.nextDouble();

            System.out.println("nilai rata-rata: " + (nilaiSkolastik + nilaiPenalaranMat + nilaiBahasaInggris)/3  );


            System.out.println("kelas matrikulasi yang diikuti:");
            
        
            
            if (kategori.equalsIgnoreCase("SMA") || kategori.equalsIgnoreCase("MA")) {
                System.out.println("-mahasiswa wajib mengikuti matrikulasi praktikum rangkaian listrik");
            }else if (kategori.equalsIgnoreCase("SMK") && nilaiRataRata < 70 ) {
                System.out.println("-mahasiswa wajib mengikuti matrikulasi praktikum rangkaian listrik");
            }

            if (kategori.equalsIgnoreCase("MA") || kategori.equalsIgnoreCase("SMK")) {
                System.out.println("-perlu mengikuti matrikulasi kalkulus 1");
            }else if (kategori.equalsIgnoreCase("SMA") && nilaiPenalaranMat < 75) {
                System.out.println("-perlu mengikuti matrikulasi kalkulus 1");
            }

            if (nilaiBahasaInggris < 65 ) {
                System.out.println("-mengikuti Praktikum rangkaian bahasa inggris dasar");
            }
        

            
            System.out.print("Apakah Anda ingin mengecek mahasiswa lain? (ya/tidak)");
            String option = mai.next();
            if (option.equals("tidak")) {
                selesai = true;
            }
            mai.nextLine();
        }
    }
}
