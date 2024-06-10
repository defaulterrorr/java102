import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int select,count=0;
        double ort,sum=0;
        System.out.print("Sayi giriniz(3% ve 4%): ");
        select = inp.nextInt();
        for (int i=0; i<=select; i++) {
            if (i%12==0) {
                sum+=i;
                count++;
                System.out.println("i = " +i);
            }
        }
        ort =sum/count;
        System.out.println("Ortalama = " + ort);

    }
}
