import java.util.Scanner;

/**
 * Star18
 */
public class Star18 {

    public static void main(String[] args) {
        Scanner mai = new Scanner (System.in);

        System.out.print ("Masukkan jumlah *: ");
        int n = mai.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}