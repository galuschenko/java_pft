package ua.qa.pft.testingweb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewLesson11 {
     private static List<Integer>evenNumbers = new ArrayList<Integer>();
     private static List<Integer>oddNumbers = new ArrayList<Integer>();
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int [][] matrix = fillTheMatrix(n,m);

        System.out.println(SOUTTheMatrix(matrix,n,m));
        getNumbers(matrix, n, m);



    }
    public static int [][] fillTheMatrix(int n, int m) {
        int [][] matrix = new int[n][m];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                matrix[i][j] = (int)(Math.random()*100);
            }
        }
        return matrix;
    }
    public static String SOUTTheMatrix (int [][] matrix, int n, int m){
        String matrixSOUT = "";
        for (int i = 0; i <n; i++){
            matrixSOUT = matrixSOUT + '\n';
            for (int j = 0; j<m; j++) {
                if (matrix[i][j] > 9) {
                    matrixSOUT = matrixSOUT + "  " + matrix[i][j];
                }
                if (matrix[i][j] < 10) {
                    matrixSOUT = matrixSOUT + "  " + matrix[i][j] + " ";
                }
            }
        }
        return matrixSOUT;
    }

    public static void getNumbers (int [][] matrix, int n, int m) {

        for (int i=0; i<n; i++) {
            counter(matrix, m, i, 0);
        }
        int summEven = 0;
        int summOdd = 0;
        for (int e : evenNumbers) {
        summEven += e;
        }
        for (int o : oddNumbers) {
            summOdd += o;
        }
        System.out.println("Even numbers: " + Arrays.asList(evenNumbers.toArray()) + "\nSumm = " + summEven);
        System.out.println("Odd numbers: " + Arrays.asList(oddNumbers.toArray()) + "\nSumm = " + summOdd);
            }

    public static void counter (int [][] matrix, int m, int i, int j) {
        if (j <= m-1) {
            if (matrix[i][j] % 2 == 0) {
                evenNumbers.add(matrix[i][j]);
                j++;
                counter(matrix, m, i, j);
                } else if (matrix[i][j] %2 != 0){
                oddNumbers.add(matrix[i][j]);
                j++;
                counter(matrix, m, i, j);
                }
            }
    }


}
