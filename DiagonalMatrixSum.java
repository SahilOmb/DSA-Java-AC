import java.util.Scanner;

public class DiagonalMatrixSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          int r = size;
          int c = size;
        int[][] matrix = new int[r][c];
        
        System.out.println("Enter "+(r*c)+" numbers to fill the matrix:");
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 4; cols++) {
                matrix[rows][cols] = sc.nextInt();
            }
        }

        // Print out the initial matrix visualizer using tabs (\t) for neat grid rows
        System.out.println("\nThe original matrix is: ");
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 4; cols++) {
                System.out.print(matrix[rows][cols] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        DiagonalMatrixSum dms = new DiagonalMatrixSum();
        System.out.println("the sum of diagonals is :" + dms.DiagonalSum(matrix, size));
}
  
    private int DiagonalSum(int[][] matrix, int size){
       int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
      //will calculate both diagonals in single conditional statement 
                if(i == j || (i+j)==size-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

}
