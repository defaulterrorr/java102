import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String word)
    {
        for (int i = 0,j=word.length()-1; i < word.length(); i++,j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Palindrom kontrolu icin bir kelime giriniz: ");
        String word = in.nextLine();
        if (isPalindrome(word)) {
            System.out.println(word +" kelimesi Palindrome kelimedir");
        }
        else{
            System.out.println(word +" kelimesi Palindrome degildir.");
        }
    }
}
