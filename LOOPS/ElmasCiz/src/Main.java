import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val, mid_val, dbl_val;
        System.out.print("Elmas cizecek satir sayisi giriniz: ");
        val = inp.nextInt();
        mid_val = (val / 2);
        dbl_val = (val * 2);

        for (int i = 1; i <= val; i++) {

            for (int j = val; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (i < mid_val+1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
                }
            System.out.println();
            }

        for (int i = val - 1; i >= 1; i--) {

            for (int j = val; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}

