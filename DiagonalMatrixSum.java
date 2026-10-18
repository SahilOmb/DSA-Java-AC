import java.util.Scanner;

public class DiagonalMatrixSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        
        System.out.println("Enter 16 numbers to fill the 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
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
        System.out.println(dms.DiagonalSum(matrix));
}
  
    private int DiagonalSum(int[][] matrix){
       int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i == j || (i+j)==3){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

}