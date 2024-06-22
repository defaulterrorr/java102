import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val_n, val_r;
        double n_fact=1, r_fact=1, n_r_fact=1,out;
        System.out.print("Kume eleman sayisini giriniz(N): ");
        val_n = inp.nextInt();

        System.out.print("Grup sayisini giriniz(r): ");
        val_r = inp.nextInt();

        for(int i=1;i<=val_n;i++)
        {
            n_fact*=i;
            if(i<=val_r){
                r_fact*=i;
            }

            if(i<=(val_n-val_r)){
                n_r_fact*=i;
            }

        }

        out=n_fact/(r_fact*n_r_fact);
        System.out.print("N'in r'li kombinasyonu= "+out);

    }
}
