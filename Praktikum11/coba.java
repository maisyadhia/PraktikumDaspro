/**
 * coba
 */
import java.util.Scanner;
public class coba {

    public static void main(String[] args) {
        Scanner mai = new Scanner (System.in);
        
        int i, j;
        

        System.out.print("Masukkan nilai n (n > 2): ");
        int n = mai.nextInt();
        
        for (i=1;i< n;i++) {
            for (j=0;j<=n ;j++) {
                System.out.print("");
            }
            for( j = 1; j <=  i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
}