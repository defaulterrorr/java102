import java.util.Scanner;
public class Main {

    static int Recursive_Us_Al (int val_alt,int val_ust)
    {
        if (val_ust == 0)
            return 1;

         return val_alt*Recursive_Us_Al(val_alt,val_ust-1);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val_alt,val_ust;
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        val_alt = inp.nextInt();

        System.out.print("Ust degerini giriniz: ");
        val_ust = inp.nextInt();

        System.out.println("Sonuc = "+Recursive_Us_Al(val_alt,val_ust));
    }
}