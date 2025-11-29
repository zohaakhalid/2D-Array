import java.util.Scanner;
public class MaxSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] array = new int[3][3];

        System.out.print("Enter elements of row and column: ");
        for(int i = 0; i<array.length; i++){
            for(int j =0; j<array[i].length; j++)
            array[i][j] = sc.nextInt();
        }

        int MaxRowSum = Integer.MIN_VALUE;
        int MaxRowIndex = -1;
        for(int i = 0; i<array.length; i++){
            int RowSum = 0;
            for(int j =0; j<array[i].length; j++)
            RowSum += array[i][j];

            if(RowSum > MaxRowSum)
               MaxRowSum = RowSum;
               MaxRowIndex = i;
        }
        
        int MaxColSum = Integer.MIN_VALUE;
        int MaxColIndex = -1;
        for(int j = 0; j<array[0].length; j++){
            int ColSum = 0;
            for(int i =0; i<array.length; i++)
            ColSum += array[i][j];

            if(ColSum > MaxColSum)
               MaxColSum = ColSum;
               MaxRowIndex = j;
    }
    System.out.println("Max Row Sum is: " + MaxRowSum);
    System.out.println("Max Col Sum is: " + MaxColSum);
    }
}