import java.util.Scanner;

/**
 * Triangle18
 */
public class Triangle18 {

    public static void main(String[] args) {
        Scanner mai = new Scanner (System.in);

        int i = 1;
        
        System.out.print ("Masukkan jumlah *: ");
        int n = mai.nextInt();

        while (i <= n) {
            int j = 0;

            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}