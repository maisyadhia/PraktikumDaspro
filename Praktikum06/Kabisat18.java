import java.util.Scanner;

/**
 * Kabisat18
 */
public class Kabisat18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tahun;

        System.out.println("Masukkan Tahun");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0 && (tahun % 100 ) != 0 || (tahun % 400) == 0) {
            System.out.println("Adalah Tahun Kabisat");
        } else {
            System.out.println("adalah bukan tahun kabisat");
        }
    }
}