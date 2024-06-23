import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val;
        boolean bool = false;
        System.out.print("Kac sayisina kadar olan asal sayilari yazalim? : ");
        val = inp.nextInt();
        if (val < 2) {
            System.out.println(val + "Asal sayi degildir.");
        } else {
            for (int i = 2; i < val; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        bool = true;
                        break;
                    }
                }
                if (bool == false) {
                    System.out.print(i+" ");
                } else {
                    bool = false;
                }
            }
        }
    }
}