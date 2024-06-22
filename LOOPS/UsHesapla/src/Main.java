import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val;
        double temp_4=1, temp_5=1;
        System.out.print("Sayi ust siniri giriniz: ");
        val = inp.nextInt();
        for(int i=0;i<=val;i++)
        {
            System.out.println("4 uzeri "+i+" ="+temp_4);
            temp_4=4*temp_4;
            System.out.println("5 uzeri "+i+" ="+temp_5);
            temp_5=5*temp_5;
            System.out.println("---------------");
        }


    }
}
