public class ElementPassing {

   public int[] PassByReference(int nums[]){

      for (int idx = 0; idx < nums.length; idx++) {
         nums[idx]=nums[idx]+1;
      }
    return nums;

   /*Pass-by-Reference: The method receives the direct memory address of the original variable, 
    meaning any modifications inside the method immediately alter the original data outside.*/
   }  
   public int PassingByValue(int n){
     n = n + 10 *(n / 17);
    return n;

 /*Pass-by-Value: The method receives a brand-new copy of the actual data, 
 meaning changes made inside the method have no effect on the original variable.*/ 
    }
      public static void main(String[] args) {
        int nums[]={10,43,78,35,90,23,82,19};
        int n = 10;
        ElementPassing el = new ElementPassing();
        el.PassByReference(nums);
        el.PassingByValue(n);
        System.out.println(n);
        for (int num : nums) {
            System.err.print(num+",");
        }
        
    }
}
