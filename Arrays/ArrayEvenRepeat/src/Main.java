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
        int[] arr = {1,2,3,3,1,4,5,6,7,4,6,2,8,9,10};
        int[] duplicate = new int[arr.length];
        int startVal=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i!=j && arr[i]==arr[j]) {
                    if(!isFind(duplicate,arr[i])&&arr[i]%2==0){
                        duplicate[startVal++]=arr[i];
                    }
                }
            }
        }

        for(int i:duplicate){
            if(i!=0)
                System.out.print(i+" ");
        }

    }
}
