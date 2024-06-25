import java.util.Scanner;

public class Main {

    static boolean isPrime(int n,int bol)
    {
        if(n<2)
            return false;
        if (n%bol==0)
            return false;
        if(bol>n/2)
            return true;

        return isPrime(n,bol+1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int val = in.nextInt();

        System.out.println(isPrime(val,2)?val +" sayisi asaldir.":val +"sayisi asal degildir.");

    }
}
