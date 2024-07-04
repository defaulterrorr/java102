import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(100) ;

        Scanner sc = new Scanner(System.in);
        System.out.println("5 hakkiniz bulunmaktadir.");
        System.out.print("100e kadar bir tahmin sayisi giriniz: ");
        int sayi = sc.nextInt();
        int right=5;
        String loopHead="------------------";
        int[] oldNums = new int[right];

        while (right>0)
        {
            System.out.println(loopHead);
            if(sayi==num)
            {
                System.out.println("Tebrikler dogru tahmin. Secilen sayi: "+sayi);
                break;

            } else if (sayi<0 || sayi>100) {

                System.out.println("0-100 arasi bir sayi giriniz. Girilen sayi: "+sayi);
                oldNums[5-right]=sayi;
                right--;
                System.out.print(right+" hakkiniz kaldi.");
                if(right==0)
                {
                    System.out.println("Hakkiniz bitti. Tahmin sayisi "+num+" secilmisti.");
                }
                else {
                    System.out.print("Yeni bir sayi giriniz: ");
                    sayi = sc.nextInt();
                }
            }
            else
            {

                System.out.println(sayi<num?"Yanlis tahmin. Girilen sayi tahminden kucuktur.":
                        "Girilen sayi tahminden buyuktur." +"Girilen sayi: "+sayi);
                oldNums[5-right]=sayi;
                right--;
                if(right==0)
                {
                    System.out.println("Hakkiniz bitti. Tahmin sayisi "+num+" secilmisti.");
                }
                else
                {
                    System.out.print(right+" hakkiniz kaldi.");
                    System.out.print("Yeni bir sayi giriniz.");
                    sayi=sc.nextInt();

                }

            }

            System.out.print(" Girilen sayi tahminleriniz: ");
            for(int i:oldNums)
            {
                if(i!=0)
                    System.out.print(i+" - ");
            }
            System.out.println();

        }

    }
}
