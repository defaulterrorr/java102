import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner in = new Scanner(System.in);

    int rowNum;
    int colNum;
    int inpSyc;
    int rndMatrixLen;
    String[][] mineMatrix ;
    String[][] showMatrix;


    MineSweeper(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.inpSyc=0;
        this.rndMatrixLen=0;

    }


    public void checkMatrix()
    {
        System.out.print("Mayin tarlasi oyunu icin satir sayisi giriniz: ");
        this.rowNum=in.nextInt();

        System.out.print("Mayin tarlasi oyunu icin sutun sayisi giriniz: ");
        this.colNum=in.nextInt();

        while (true) {
            if(rowNum<2||colNum<2){
                System.out.println("Matris boyutu minimum 2x2 olmalidir. Tekrar giriniz.");
                checkMatrix();
            }
            else
                break;
        }
    }



    public void getMatrix() {

        this.showMatrix = new String[this.rowNum][this.colNum];
        this.mineMatrix = new String[this.rowNum][this.colNum];

        int rndRow=this.rowNum * this.colNum / 4;
        int[][] rndMatrix = new int[rndRow][2];
        this.rndMatrixLen=rndMatrix.length;
        this.inpSyc=this.rowNum*this.colNum-rndMatrixLen;
        Random rnd = new Random();

        for (int i = 0; i < rndMatrix.length; i++) {
            rndMatrix[i][0] = rnd.nextInt(this.rowNum );
            rndMatrix[i][1] = rnd.nextInt(this.colNum);
        }


        for (int i = 0; i < this.rowNum; i++) {
            for (int j = 0; j < this.colNum; j++)
                    this.mineMatrix[i][j] = "-";
        }

        copyMatrix();

        for (int[] matrix : rndMatrix) {
            mineMatrix[matrix[0]][matrix[1]] = "*";
        }
        printMatrix();
    }

    public void askUser(){
        System.out.print("([0]. indisten baslayarak... ");
        System.out.print("Satir giriniz: ");
        int rndRow=in.nextInt();
        System.out.print("Sutun giriniz: ");
        int rndCol=in.nextInt();

            if(rndRow<mineMatrix.length&&rndCol<mineMatrix[rndRow].length){
                if (mineMatrix[rndRow][rndCol].equals("*")) {
                    findAround(rndRow,rndCol);
                    System.out.println("Secili noktada mayin bulunmaktadir. Kaybettiniz.");
                    System.out.println("GAME OVER");

                }
                else if (!showMatrix[rndRow][rndCol].equals("*")&&!showMatrix[rndRow][rndCol].equals("-")) {
                    System.out.println("Bu koordinat daha once secildi, baska bir koordinat girin.");
                    askUser();
                }  else
                {
                    this.inpSyc=getRights(this.inpSyc);
                    if (this.inpSyc==0) {
                        findAround(rndRow,rndCol);
                        System.out.println("Tebrikler. Oyunu kazandiniz.");
                    }
                    else
                    {
                        findAround(rndRow,rndCol);
                        askUser();
                    }
                }

            }
            else
            {
                System.out.println("Sinirlar icerisinde bir deger giriniz.");
                askUser();
            }
        }


    public void findAround(int rndRow,int rndCol){
        int syc=0;
        if(rndRow-1>=0){
            if(mineMatrix[rndRow-1][rndCol].equals("*")){
                syc+=1;
            }
        }
        if(rndRow-1>=0&&rndCol-1>=0){
            if(mineMatrix[rndRow-1][rndCol-1].equals("*")){
                syc+=1;
            }
        }
        if(rndRow-1>=0&&rndCol+1<mineMatrix[0].length){
            if(mineMatrix[rndRow-1][rndCol+1].equals("*")){
                syc+=1;
            }

        }
        if(rndCol-1>=0){
            if(mineMatrix[rndRow][rndCol-1].equals("*")){
                syc+=1;
            }
        }
        if(rndCol+1<mineMatrix[0].length){
            if(mineMatrix[rndRow][rndCol+1].equals("*")){
                syc+=1;
            }
        }
        if(rndRow+1< mineMatrix.length&&rndCol-1>=0){
            if(mineMatrix[rndRow+1][rndCol-1].equals("*")){
                syc+=1;
            }
        }
        if(rndRow+1<mineMatrix.length&&rndCol+1<mineMatrix[0].length){
            if(mineMatrix[rndRow+1][rndCol+1].equals("*")){
                syc+=1;
            }
        }
        if(rndRow+1<mineMatrix.length){
            if(mineMatrix[rndRow+1][rndCol].equals("*")){
                syc+=1;
            }
        }

       showMatrix[rndRow][rndCol] = String.valueOf(syc);

        printMatrix();
        System.out.println("===============");
    }

    public void copyMatrix()
    {
        for (int i = 0; i < this.rowNum; i++) {
            if (this.colNum >= 0) System.arraycopy(this.mineMatrix[i], 0, this.showMatrix[i], 0, this.colNum);
        }
    }
    public int getRights(int inpSyc)
    {
        inpSyc-=1;
        return inpSyc;
    }

    public void printMatrix(){
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.print(showMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void run()
    {
        checkMatrix();
        getMatrix();
        askUser();

    }


}
