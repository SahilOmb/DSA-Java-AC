public class ArrayPair {

    protected void ArrayPairs(int nums[]){
       for (int i = 0; i < nums.length; i++) {
           int current = nums[i];
           for (int j = i+1; j < nums.length; j++) {
               System.out.print("("+current+","+nums[j]+")");
           }         
       }   
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        ArrayPair ap = new ArrayPair();
        ap.ArrayPairs(nums);
    }
}
