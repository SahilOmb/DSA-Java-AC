public class StaircaseSearch {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3}
                       ,{4,5,6}
                       ,{7,8,9}};
        int target = 5;
        StaircaseSearch scs = new StaircaseSearch();
        if(scs.StaircaseSearch(matrix,target)==false){
            System.out.println("not found");
        }else{
            System.out.println("found it");
        }
    }

    private boolean StaircaseSearch(int[][] matrix,int target){
        if(matrix.length==0 || matrix==null){
              return false;
        }
         int row =0;
         int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0){
            if(matrix[row][col]==target){
                return true;
            }else if (matrix[row][col]>target) {
                col--;// Target is smaller -> Move Left
            }else{
                row++;// Target is larger -> Move Down
            }
         }

        return false;
    }
}
