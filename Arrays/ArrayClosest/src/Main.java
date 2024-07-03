import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};
        int givenVal=5;
        int minVal=0;
        int maxVal=0;
        int eps_1 =Integer.MAX_VALUE;
        int eps_2 =Integer.MAX_VALUE;
     for(int i:arr){
         if(i<givenVal&&(givenVal-i)< eps_1){
             eps_1 =givenVal-i;
             minVal=i;
         }
         if(i>givenVal&&(i-givenVal)< eps_2){
             eps_2 =i-givenVal;
             maxVal=i;
         }
     }
        System.out.println("Dizi : "+ Arrays.toString(arr));
        System.out.println("Girilen sayi : "+givenVal);
     System.out.println("Girilen sayidan kucuk en yakin sayi : "+minVal);
     System.out.println("Girilen sayidan buyuk en yakin sayi : "+maxVal);
    }
}
