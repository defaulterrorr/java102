import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int val,temp=2;
        System.out.print("Kac sayisina kadar olan fibonacci sayilari yazalim? : ");
        val = inp.nextInt();

        System.out.println("0 + 1 = "+ 1);
        System.out.println(1 + " + 1 = "+ 2);
        for (int i = 1; i <= val; i++) {
            System.out.println(i + " + "+temp+" = "+ (temp+i));
            temp += i;
        }
    }
}