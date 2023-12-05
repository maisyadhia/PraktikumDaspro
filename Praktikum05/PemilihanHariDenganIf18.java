
import java.util.Scanner;
/**
 * PemilihanHariDenganIf18
 */
public class PemilihanHariDenganIf18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName;
        int dayType;

        System.out.print("Input day number: ");
        dayType = sc.nextInt();

        //System.out.println("nama hari");
        //dayName = sc.nextLine();
        
        if (dayType == 1) {
            dayName = "Minggu";
        } else if (dayType == 2) {
            dayName = "Senin";
        } else if (dayType == 3) {
            dayName = "Selasa";
        } else if (dayType == 4) {
            dayName = "Rabu";
        } else if (dayType == 5) {
            dayName = "Kamis";
        } else if (dayType == 6) {
            dayName = "Jumat";
        } else if (dayType == 7) {
            dayName = "Sabtu";
        } else {
            dayName = "Hari tidak valid";
        }
        System.out.println(dayName);
    }
}
    