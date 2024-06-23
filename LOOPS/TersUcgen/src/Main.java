import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val;
        System.out.print("Ters ucgen icin satir sayisi giriniz: ");
        val = inp.nextInt();

            for (int i = val; i>0; i--) {
                for (int j=(2*i-1); j > 0; j--) {

                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }

    }