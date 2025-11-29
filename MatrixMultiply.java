import java.util.Scanner;
public class MatrixMultiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] MatrixA = new int[3][4];
        System.out.print("Enter elements of first matrix: ");
        for(int i = 0; i<MatrixA.length; i++){
            for(int j =0; j<MatrixA[i].length; j++)
            MatrixA[i][j] = sc.nextInt();
        }
        int [][] MatrixB = new int[4][3];     
        System.out.print("Enter elements of second matrix: ");
        for(int i = 0; i<MatrixB.length; i++){
            for(int j =0; j<MatrixB[i].length; j++)
            MatrixB[i][j] = sc.nextInt();
        }
        
        int rowsA = MatrixA.length;
        int colsA = MatrixA[0].length;
        int colsB = MatrixB[0].length;

        int [][] MatrixC = new int [rowsA][colsB];

        for(int i = 0; i < rowsA; i++){
            for(int j = 0; j < colsB; j++){
                MatrixC [i][j] = 0;
                for(int k =0; k < colsA; k++){
                    MatrixC[i][j] += MatrixA[i][k] * MatrixB[k][j];
                }
            }
        }
        for(int i = 0; i<rowsA; i++){ 
        for(int j =0; j<colsB; j++){
        System.out.print(MatrixC[i][j] + " ");
}
System.out.println();
        }
    }
}
