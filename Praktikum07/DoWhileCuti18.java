import java.util.Scanner;

/**
 * DoWhileCuti18
 */
import java.util.Scanner;
public class DoWhileCuti18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jatahCuti, jumlahHari ;
        String konfirmasi ;

        System.out.println("jatah cuti");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("apakah anda ingin mengambil cuti (ya/tidak)? ");
            konfirmasi = sc.next();
            
            if (konfirmasi.equalsIgnoreCase("ya")) {
                System.out.println("jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mecukupi.silakan masukkkan jumlah hari yang sesuai");
                    continue;
                }
            }else if (konfirmasi.equalsIgnoreCase("tidak"))
            break;
        } while (jatahCuti > 0);
    }
}