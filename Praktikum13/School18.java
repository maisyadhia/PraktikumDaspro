/**
 * School18
 */
public class School18 {
    public static void main(String[] args) {
    String[] students1A = { "Anne", "Aldrian", "Ali", "Arul", "Ashley" };
    String[] students1B = { "Bobby", "Brian", "Bill" };
    String[] students1C = { "Clara", "Celine", "Charlie", "Caroline" };
    String[] students1D = { "Daniel", "Daisy", "Diana" };

    display(students1A);
    display(students1B);
    display(students1C);
    display(students1D);  
    }

    public static void display(String[] students){
    System.out.printf("+++++++++++++++++++++++++%n");
    System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
    System.out.printf("+++++++++++++++++++++++++%n");

    for (int i = 0; i < students.length; i++) {
        System.out.printf("| %-3d | %-15s |%n", (i + 1), students[i]);
    }

    System.out.printf("+++++++++++++++++++++++++%n%n");
}
    

    // System.out.printf("=========================%n" );
    // System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
    // System.out.printf("=========================%n");

    // for (int i = 0; i < students1B.length; i++) {
    //     System.out.printf("| %-3d | %-15s |%n", (i + 1), students1B[i]);
    // }

    // System.out.printf("=========================%n%n") ;

    // System.out.printf("=========================%n");
    // System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
    // System.out.printf("=========================%n");

    // for (int i = 0; i < students1C.length; i++) {
    //     System.out.printf("| %-3d | %-15s |%n", (i + 1), students1C[i]);
    // }
    // System.out.printf("=========================%n%n");

    // System.out.printf("=========================%n" );
    // System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
    // System.out.printf("=========================%n");

    // for (int i = 0; i < students1D.length; i++) {
    //     System.out.printf("| %-3d | %-15s |%n", (i + 1), students1D[i]);
    // }

    // System.out.printf("=========================%n%n" );
    // }
}
    
    