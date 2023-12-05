package Praktikum05;
import java.util.Scanner;

public class PemilihanOperator18 {
    public static void main(String[] args) {
        Scanner mai = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = mai.nextDouble();

        System.out.print("Masukkan angka 2: ");
        angka2 = mai.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = mai.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Pembagian oleh nol tidak diperbolehkan.");
            }
        } else {
            System.out.println("Operator tidak valid. Gunakan +, -, *, atau /.");
        }

        mai.close();
    }
}