public class LargestNumArr {

    public void  LargestElementInArray(int nums[]){
        int largest = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if(largest < nums[idx]){
                largest=nums[idx];
            }
            
        }System.out.println("largest element is :"+ largest);
    }

    public static void main(String[] args) {
        int nums[]={1,4,5,7,2,5,6,9,8};
        LargestNumArr LNA = new LargestNumArr();
        LNA.LargestElementInArray(nums);
    }
}
