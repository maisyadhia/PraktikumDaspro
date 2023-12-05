import java.util.Scanner;

public class arrayBilBulat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] bilangan = new int[8];  // Membuat array untuk menyimpan 8 bilangan bulat
        int total = 0;  // Variabel untuk menyimpan total
        
        System.out.println("Masukkan 8 bilangan bulat:");
        
        // Membaca input pengguna dan menghitung total dalam satu perulangan
        for (int i = 0; i < 8; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = input.nextInt();
            total += bilangan[i];  // Menambahkan nilai ke total
        }
        
        double rataRata = total / 8;
        
        System.out.println("Rata-rata: " + rataRata);
    }
}