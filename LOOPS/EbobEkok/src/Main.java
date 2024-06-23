import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int count=1;
        int ekok,ebob=-1;
        System.out.print("n1 sayisini giriniz: ");
        int n1 = inp.nextInt();

        System.out.print("n2 sayisini giriniz: ");
        int n2 = inp.nextInt();

        while (count<=n1 && count<=n2) {
            if(n1%count==0 && n2%count==0) {
                ebob=count;
            }
            count+=1;
        }
        System.out.println("n1 ve n2 EBOB degeri= "+ebob);
        ekok=n1*n2/ebob;
        System.out.println("n1 ve n2 ekok degeri= "+ekok);
    }
}