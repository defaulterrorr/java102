import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val;
        double out=0;
        System.out.print("Bir sayi giriniz: ");
        val = inp.nextInt();
        for(int i=1;i<=val;i++)
        {
            out+=1.0/i;
        }
        System.out.println("Sayi harmonik serisi = "+out);
    }
}