/**
 * tes
 */
import java.util.Scanner;
public class tes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, namaMataKuliah, nilai ;
        int jumlahSks, nilaiMatkul ;

        System.out.println("Masukkan nama mu: ");
        namaMahasiswa = input.nextLine();

        System.out.println("nama matkul e? ");
        namaMataKuliah = input.nextLine();

        System.out.println("nilai matkul: ");
        nilaiMatkul = input.nextInt();

        if (nilaiMatkul == 4.0 ) {
            nilai = "A";
        } else if (nilaiMatkul == 3.5) {
            nilai = "B+";
        }
            


        
    }
}