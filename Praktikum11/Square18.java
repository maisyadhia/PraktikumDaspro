import java.util.Scanner;

/**
 * Square18
 */
public class Square18 {

    public static void main(String[] args) {
        Scanner mai = new Scanner(System.in);

        System.out.print ("Masukkan jumlah *: ");
        int n = mai.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}