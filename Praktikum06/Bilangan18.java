import java.util.Scanner;

/**
 * Bilangan18
 */
public class Bilangan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int bilangan1, bilangan2, bilangan3 ;

        System.out.println("masukkan bilangan 1");
        bilangan1 = sc.nextInt();
        System.out.println("masukkan bilangan 2");
        bilangan2 = sc.nextInt();
        System.out.println("masukkan bilangan 3");
        bilangan3 = sc.nextInt();

        if (bilangan1 > bilangan2) {
            if (bilangan1 > bilangan3){
                System.out.println("bilangan 1 adalah bilangan terbesar");
            } else {
                System.out.println("bilangan 3 adalah bilangan terbesar");
            }
        } else {
            if (bilangan2 > bilangan3) {
                System.out.println("bilangan 2 adalah yang terbesar");
            } else {
                System.out.println("bilangan 3 yang terbesar");
            }
        }

        if (bilangan1 < bilangan2) {
            if (bilangan1 < bilangan3){
                System.out.println("bilangan 1 adalah bilangan terkecil");
            } else {
                System.out.println("bilangan 3 adalah bilangan terkecil");
            }
        } else {
            if (bilangan2 < bilangan3) {
                System.out.println("bilangan 2 adalah yang terkecil");
            } else {
                System.out.println("bilangan 3 yang terkecil");
            }
        }

        int middle ;
        if ((bilangan2<bilangan1 && bilangan1<bilangan3) || (bilangan3<bilangan1 && bilangan1<bilangan2)) {
            middle = bilangan1;
        }else if((bilangan1<bilangan2 && bilangan2<bilangan3) || (bilangan3<bilangan2 && bilangan2<bilangan1)) {
            middle = bilangan2;
        } else {
            middle = bilangan3;
        } 
        System.out.println("bilangan tengah adalah = " + middle);

    }
}