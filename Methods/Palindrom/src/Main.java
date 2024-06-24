import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Palindrome sayi testi icin bir deger giriniz : ");
        int val = inp.nextInt();
        System.out.println("Sonuc : "+isPalindrom(val));
    }

    static boolean isPalindrom(int num)
    {
        int firt_num=num,lastnum, reverse_num =0;
        while(num>0)
        {
            lastnum=num%10;
            reverse_num=reverse_num*10+lastnum;
            num=num/10;
        }
        return firt_num == reverse_num;
    }


}