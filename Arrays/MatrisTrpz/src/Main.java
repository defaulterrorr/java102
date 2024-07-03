import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] A_Trp = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A_Trp[j][i] = A[i][j];
            }
        }
        System.out.println("Matris : ");
        for (int[] i : A) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");
        for (int[] i : A_Trp) {
            for (int j = 0; j < A_Trp[0].length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }


    }
}
