import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val_alt,val_ust,out=1;
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        val_alt = inp.nextInt();

        System.out.print("Ust degerini giriniz: ");
        val_ust = inp.nextInt();

        for(int i = 1; i<= val_ust; i++)
        {
            out=val_alt*out;
        }
        System.out.println("Sonuc = "+out);
    }
}