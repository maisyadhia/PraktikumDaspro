/**
 * salinNilaiArray
 */
public class salinNilaiArray {

    public static void main(String[] args) {
        int arraySatu[] = {1,2,3,4,5,6,7};
        int arrayDua[] = new int[arraySatu.length];
        int i;

        System.out.println("Array Kesatu = ");
        for(i= 0; i< arraySatu.length; i++) {
            System.out.println(arraySatu[i]+ " ");
            arrayDua[i] = arraySatu[i];
        }

        System.out.println("array kedua = ");
        for(i = 0; i < arrayDua.length; i++) {
            System.out.println(arrayDua[i] + " ");
        }
    }
}