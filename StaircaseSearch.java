public class StaircaseSearch {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3}
                       ,{4,5,6}
                       ,{7,8,9}};
        int target = 5;
        StaircaseSearch scs = new StaircaseSearch();
        int[] position = scs.findPosition(matrix, target);
        
        if (position[0] == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Found it at position: Row " + position[0] + ", Column " + position[1]);
        }
    }

    private int[] StaircaseSearch(int[][] matrix,int target){
        if(matrix.length==0 || matrix==null){
              return new int[]{-1, -1};
        }
         int row =0;
         int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0){
            if(matrix[row][col]==target){
                return new int[]{row, col};;
            }else if (matrix[row][col]>target) {
                col--;// Target is smaller -> Move Left
            }else{
                row++;// Target is larger -> Move Down
            }
         }

         return new int[]{-1, -1}; // Returns this if the loop finishes without finding the target
    }
}
