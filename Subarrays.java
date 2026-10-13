public class Subarrays {

    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        Subarrays sa = new Subarrays();
        sa.SubArrays(nums);

    }

    protected void SubArrays(int nums[]){
        for (int i = 0; i < nums.length; i++) {
          for (int j = i; j < nums.length; j++) {
            System.out.print("[");
            for (int k = i; k <= j; k++) {
                System.out.print(nums[k]+(k < j ? "," :""));
            } 
            System.out.print("] ");
          }
            System.out.println();
        }
    }


}
