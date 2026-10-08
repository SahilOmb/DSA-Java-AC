public class ReverseAnArray {


public void ReverseTheArray(int nums[]){
     int left = 0;
     int right = nums.length-1;
     while(left<right){
         int temp= nums[left];
         nums[left]=nums[right];
         nums[right]=temp;
         
         left++;
         right--;
     }
}



    public static void main(String[] args) {
        int nums[]={10,40,50,20,30,70,90};
        ReverseAnArray ra = new ReverseAnArray();
        ra.ReverseTheArray(nums);

        for (int n : nums) {
      System.out.print(n + " ");
    }
    }
}
