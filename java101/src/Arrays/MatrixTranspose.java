package Arrays;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Matrisin boyutlarını giriniz...");
        System.out.print("Satır : ");
        int i = inp.nextInt();
        System.out.print("Sütun : ");
        int j = inp.nextInt();

        int[][] matrix = new int[i][j];
        int[][] transMatrix = new int[j][i];

        for (int k = 0; k < i; k++){
            for (int l = 0; l < j; l++){
                System.out.print((k+1) + ". satır " + (l+1) + ". sütun değeri : ");
                int entry = inp.nextInt();
                matrix[k][l] = entry;
                transMatrix[l][k] = matrix[k][l];
            }
        }

        System.out.println("Verilen Matris");
        for (int[] row: matrix){
            for (int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("Verilen Matrisin Transpozesi");
        for (int[] row: transMatrix){
            for (int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
