import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int min= Integer.MAX_VALUE, max=Integer.MIN_VALUE,temp;
        System.out.print("Kac tane sayi gireceksiniz: ");
        int count = inp.nextInt();

        for (int i = 1; i <= count; i++) {

            System.out.print(i+". Sayiyi giriniz: ");
            temp = inp.nextInt();
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("En buyuk sayi= "+ max);
        System.out.println("En kucuk sayi= "+ min);
    }
}