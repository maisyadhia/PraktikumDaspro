import java.util.Scanner;

/**
 * NestedLoop18
 */
public class NestedLoop18 {

    public static void main(String[] args) {
        Scanner mai = new Scanner (System.in);

        double rataRata,nilaiTotal;
        int n;

        System.out.print("Masukkan kota yang diinginkan: ");
        n = mai.nextInt();
        double[][] suhu = new double[n][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(" Suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = mai.nextInt();
                
            }
            
        }

        
        for (int i = 0; i < suhu.length; i++) {
            System.out.print ("KOTA KE-" + (1 + 1) + ": ");
            nilaiTotal=0;
            // for (int j = 0; j < suhu[i].length; j++) {
            //     System.out.print(suhu[i][j] + " ");
            // }
            for ( double a : suhu[i]  ) {
                System.out.println("Suhu : " + a );
                nilaiTotal += a;
            }
            rataRata =  nilaiTotal / suhu[i].length;
            System.out.println("Nilai rata-rata: " + rataRata);
            System.out.println();
        }

        
    }
}