import java.util.Scanner;

public class Main {

    static void Mirror(int n, int realNum,boolean bool)
    {
        System.out.print(n+" ");

        if(n<=0)
            bool=true;
        if(n==realNum&&bool)
            return;
        if (!bool)
            Mirror(n-5,realNum,bool);
        if (n<realNum&&bool)
        {
            Mirror(n + 5,realNum,bool);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int val = in.nextInt();
        Mirror(val, val,false);

    }
}
