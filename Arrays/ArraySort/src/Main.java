import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = sc.nextInt();

        System.out.println("Dizinin elemanlarını giriniz :");

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". Elemani : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("Siralama : "+ Arrays.toString(arr));

    }
}
