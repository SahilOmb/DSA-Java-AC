import java.util.Scanner;

public class SpiralMatrix {

    private void printSpiral(int[][] matrix) {
        // Safety check: if the matrix is completely empty, do nothing
        if (matrix == null || matrix.length == 0) return;

        // Initialize our 4 wall boundaries (the coordinate markers)
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        System.out.print("Spiral order: ");
        
        // Loop runs as long as our boundaries haven't crossed each other
        while (top <= bottom && left <= right) {
            
            // =========================================================================
            // 1. Print Top Row (Left to Right)
            // =========================================================================
            // row coordinate is fixed at 'top'. 
            // col coordinate 'i' moves from left to right.
            // Together, matrix[top][i] slides horizontally across the current ceiling row.
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // top++ pushes the ceiling down one row since we are done with it


            // =========================================================================
            // 2. Print Right Column (Top to Bottom)
            // =========================================================================
            // col coordinate is fixed at 'right'.
            // row coordinate 'i' moves from top to bottom.
            // Together, matrix[i][right] uses both values to slide vertically down the right wall.
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // right-- pulls the right wall inward by one column


            // =========================================================================
            // 3. Print Bottom Row (Right to Left)
            // =========================================================================
            // Safety Check: Make sure top and bottom walls haven't crossed yet
            if (top <= bottom) {
                // row coordinate is fixed at 'bottom'.
                // col coordinate 'i' moves backward from right to left.
                // Together, matrix[bottom][i] slides horizontally backward across the floor row.
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // bottom-- lifts the floor upward by one row
            }


            // =========================================================================
            // 4. Print Left Column (Bottom to Top)
            // =========================================================================
            // Safety Check: Make sure left and right walls haven't crossed yet
            if (left <= right) {
                // col coordinate is fixed at 'left'.
                // row coordinate 'i' moves backward from bottom up to top.
                // Together, matrix[i][left] slides vertically up the leftmost wall.
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // left++ pushes the left wall inward to the right
            }
        }
        System.out.println();
    }

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

        // Run the spiral function
        SpiralMatrix sm = new SpiralMatrix();
        sm.printSpiral(matrix);
        
        sc.close(); // Clean up scanner resource
    }
}
