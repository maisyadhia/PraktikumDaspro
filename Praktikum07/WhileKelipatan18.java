import java.util.Scanner;

/**
 * WhileKelipatan18
 */
import java.util.Scanner;
public class WhileKelipatan18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan, total, counter,i ;
        double rataRata ;
        total = 0;
        counter = 0;
        i = 0; 
        rataRata = 0;


        System.out.print("masukkan bilangan 1-9: ");
        bilangan = input.nextInt();

        while (i <= 50) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
            }
            if (counter > 0) {
                rataRata = (double) total / counter;
            }
            i++;

        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", bilangan,counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", bilangan, total);
        System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", bilangan, rataRata);
    }
}