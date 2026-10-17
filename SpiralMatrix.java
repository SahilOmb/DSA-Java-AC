public class SpiralMatrix {
    public static void printSpiralStraightLine(int n) {
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        // Loop runs layer by layer until boundaries cross
        while (top <= bottom && left <= right) {
            
            // 1. Move Right across the top row
            for (int i = left; i <= right; i++) {
                System.out.print("(" + top + "," + i + ") ");
            }
            top++;

            // 2. Move Down along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print("(" + i + "," + right + ") ");
            }
            right--;

            // 3. Move Left across the bottom row
            for (int i = right; i >= left; i--) {
                System.out.print("(" + bottom + "," + i + ") ");
            }
            bottom--;

            // 4. Move Up along the left column
            for (int i = bottom; i >= top; i--) {
                System.out.print("(" + i + "," + left + ") ");
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printSpiralStraightLine(n);
    }
}
