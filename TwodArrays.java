
import java.util.Scanner;

public class TwodArrays {
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int r = matrix.length, c = matrix[0].length;
        //for input 
        Scanner sc = new Scanner(System.in);
        for (int rows = 0; rows < r; rows++){
            for (int cols = 0; cols < c; cols++) {
                 System.out.print("Enter element at : "+ matrix[rows][cols]);
                matrix[rows][cols]=sc.nextInt();
            }
        }
        System.out.println("the matrix is : ");
        // for output 
        for (int rows = 0; rows < r; rows++){
            for (int cols = 0; cols < c; cols++) {
                System.out.print(matrix[rows][cols]+ " ");
            }System.out.println();
        }

    }
}
