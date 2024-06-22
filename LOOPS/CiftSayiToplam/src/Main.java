import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val=0;
        double sum=0;
        while(val%2==0) {
            if(val%4==0) {
                sum+=val;
            }
                System.out.print("Sayi giriniz: ");
                val = inp.nextInt();
        }
        System.out.println("4x olan sayilar toplami = " + sum);

    }
}
