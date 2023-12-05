/**
 * buatuts
 */
import java.util.Scanner;
public class buatuts {

    public static void main(String[] args) {
        Scanner mai = new Scanner(System.in);

        String namaMaba, namaMatkul, indeksNilai ;
        int jumlahMatkul, sks, totalSks, jumlahMatkulRemidi;
        double totalIp, iP, nilai;

        jumlahMatkulRemidi = 0;
        totalIp = 0.0;
        totalSks = 0;

        System.out.print("ur name: ");
        namaMaba = mai.nextLine();

        System.out.print("jumlah matkul: ");
        jumlahMatkul = mai.nextInt();

        for (int i = 1 ; i <= jumlahMatkul ; i++) {
            mai.nextLine();
            System.out.print("nama matkul ke-" + i +"=");
            namaMatkul = mai.nextLine();

            System.out.print("indeks nilai (A/B+/B/C+/C/D/E): ");
            indeksNilai = mai.nextLine();

            System.out.print("jumlah sks: ");
            sks = mai.nextInt();

            if (indeksNilai.equalsIgnoreCase("A")){
                nilai = 4.0;
            }else if (indeksNilai.equalsIgnoreCase("B+")) {
                nilai = 3.5;
            }else if (indeksNilai.equalsIgnoreCase("B")) {
                nilai = 3.0;
            }else if (indeksNilai.equalsIgnoreCase("C+")) {
                nilai = 2.5;
            }else if (indeksNilai.equalsIgnoreCase("C")) {
                nilai = 2.0;
            }else if (indeksNilai.equalsIgnoreCase("D")) {
                nilai = 1.0;
                jumlahMatkulRemidi++;
            }else {
                nilai = 0.0;
                jumlahMatkulRemidi++;
            }

            totalIp += (nilai * sks);
            totalSks += sks;
        }
        iP = totalIp/totalSks;
        System.out.println("namaMaba: " + namaMaba);
        System.out.println("ip mu: " + iP);
        System.out.println("jumlah matkul: " + jumlahMatkul);
        System.out.println("jumlah sks: " + totalSks);
        System.out.println("jumlah matkul remidi: " + jumlahMatkulRemidi);

    }
}