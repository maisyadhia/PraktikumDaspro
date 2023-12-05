import java.util.Scanner;

/**
 * BioskopWithScanner18
 */
public class BioskopWithScanner18 {

    public static void main(String[] args) {
        Scanner mai = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String [][] penonton = new String[4][2];

        while(true) {
            System.out.println("Menu :");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = mai.nextInt();
            switch (menu){
            case 1: 
                while (true) {
                    mai.nextLine();
                    System.out.print("masukkan nama: ");
                    nama = mai.nextLine();
                    System.out.print("masukkan baris kursi : ");
                    baris = mai.nextInt();
                    System.out.print("masukkan kolom kursi: ");
                    kolom = mai.nextInt();
                    
                    if (penonton[baris-1][kolom-1] == null)
                        penonton[baris-1][kolom-1] = nama;
                    else {
                        System.out.println("maaf tapi kursi sudah terisi,silahkan mencari kursi lain");
                    }

                    
                    System.out.print("input penonton lainnya? (y/n): ");
                    next = mai.next();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                } break;
            case 2:
                System.out.printf("%s \t %s \n", penonton [0][0], penonton[0][1]);
                System.out.printf("%s \t %s \n", penonton [1][0], penonton [1][1]);
                System.out.printf("%s \t %s \n", penonton [2][0], penonton[2][1]);
                System.out.printf("%s \t %s \n", penonton [3][0], penonton [3][1]);
                break;
            
            case 3:
                System.out.println("ANDA TELAH KELUAR,TERIMAKASIH");
                break;

            default:
                System.out.println("Menu tidak valid. Silakan pilih menu 1, 2, atau 3.");
                break;
            }
        
        }
    }
}