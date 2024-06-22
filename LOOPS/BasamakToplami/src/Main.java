import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val,out=0;int temp=0;
        System.out.print("Bir sayi giriniz: ");
        val = inp.nextInt();
        while (val != 0) {
            temp=val%10;
            out+=temp;
            val=val/10;
        }
        System.out.println("Sayi basamaklari toplami = "+out);
    }
}