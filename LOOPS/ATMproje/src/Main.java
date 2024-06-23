import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = inp.nextLine();
            System.out.print("Parolaniz : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
                do {
                    System.out.println("1-Para yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para yatirma miktari :");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Miktar hesaba eklendi");
                            break;
                        case 2:
                            System.out.print("Para Cekme miktari :");
                            price = inp.nextInt();
                            System.out.println(price>balance?"Bakiye yetersiz.":"Miktar hesaptan cekiliyor.") ;
                            if (price < balance) {
                                balance -= price;
                                System.out.println("Miktar cekildi.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                            case 4:
                                break;
                        default:
                            System.out.println("Hatali secim");
                    }
                } while (select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }
        }
    }
}