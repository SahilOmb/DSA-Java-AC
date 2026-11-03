public class SearchingMatrix {
 public static void main(String[] args) {
 int[][] matrix = {
    {1, 2, 3,7},
    {4, 5, 6,9}
    };
    int key = 7;

    SearchingMatrix sm = new SearchingMatrix();
    int result = sm.SearchingInMatrix(matrix, key);
    String msg = (result==1)? "key found" : "not found";
    System.out.println(msg);
    }

private int SearchingInMatrix(int[][] matrix,int key){
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            //System.out.print(matrix[i][j]);
            if(key == matrix[i][j]){
                return 1;
            }
            
        }
        
    }
    return -1;
}


}
