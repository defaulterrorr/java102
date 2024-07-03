public class Main {
    public static void main(String[] args) {
        int[] arr = {3,6,9,12,15,18,21};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1./arr[i];
        }
        System.out.println(arr.length/sum);
    }
}
