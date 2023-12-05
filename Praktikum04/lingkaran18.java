import java.util.Scanner;

/**
 * lingkaran18
 */
public class lingkaran18 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas ,π;
        π = 3.14;
        System.out.println("Masukkan jari-jari lingkaran: ");
        r=input.nextInt();
        keliling= 2*π*r;
        luas=π*r*r;
        System.out.println(keliling);
        System.out.println(luas);
    }
}