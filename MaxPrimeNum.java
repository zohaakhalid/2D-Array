import java.util.Scanner;
public class MaxPrimeNum{
    public static boolean isPrime(int num){
        if (num<=1) 
        return false;
        for(int i =2; i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] array = new int[3][4];

        System.out.print("Enter elements of row and column: ");
        for(int i = 0; i<array.length; i++){
            for(int j =0; j<array[i].length; j++)
            array[i][j] = sc.nextInt();
        }

        int MaxRowPrimes = -1;
        int MaxRowIndex = -1;
        for(int i = 0; i < array.length; i++){
        int RowPrimeCount= 0;
        for (int j =0; j< array[i].length; j++){
        if(isPrime(array[i][j]))
          RowPrimeCount++;
        }
        if(RowPrimeCount>MaxRowPrimes){
        MaxRowPrimes = RowPrimeCount;
        MaxRowIndex = i;
    }
        }
    int MaxColPrimes = -1;
        int MaxColIndex = -1;
        for(int j = 0; j < array[0].length; j++){
        int ColPrimeCount= 0;
        for (int i =0; i< array.length; i++){
        if(isPrime(array[i][j]))
          ColPrimeCount++;
        }
        if(ColPrimeCount > MaxColPrimes){
        MaxColPrimes = ColPrimeCount;
        MaxColIndex = j;
    }
        }
    System.out.println("Row having MaximuM prime number is " + MaxRowIndex);
    System.out.println("Col having MaximuM prime number is " + MaxColIndex );
    }
    }

