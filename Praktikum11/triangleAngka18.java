import java.util.Scanner;

public class triangleAngka18 {
    public static void main(String[] args) {
        Scanner mai = new Scanner (System.in);

        int i = 1;

        System.out.print("Masukkan nilai n (n > 2): ");
        int n = mai.nextInt();

        if (n > 2) {
            for ( i = 1; i <= n ; i= i + 1) {
                for (int j = 0; j < n -i ; ++j) {
                    System.out.print(" ");
                }
                for(int j = 1; j <=  i; ++j) {
                System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Masukkan nilai n yang lebih besar dari 2.");
        }

        mai.close();
        
    }
    
}