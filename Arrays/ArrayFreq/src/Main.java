import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr,int val){
        for(int i:arr){
            if(i==val){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[arr.length];
        int[] freq = new int[arr.length];
        int startVal=0;
        int syc=0;


        for (int i = 0; i < arr.length; i++) {
            syc=0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    syc += 1;
                }
            }
            if(!isFind(duplicate,arr[i])){
                duplicate[startVal]=arr[i];
                freq[startVal]=syc;
                startVal++;
            }
        }
        syc=0;
        System.out.println("Dizi : "+Arrays.toString(arr));
        System.out.println("Tekrar sayilari");
        for(int i:duplicate){
            if(i!=0)
                System.out.println(i+" sayisi "+freq[syc++]+" kere tekrar edildi.");
        }

    }
}