public class MaxSubArraySum {
    public static void main(String[] args) {
        int num[]={-12,43,64,7,-12,35};
       MaxSubArraySum ms = new MaxSubArraySum();
       ms.MaxSumOfSubArray(num);
    }
  
    protected void MaxSumOfSubArray(int num[]) {
     int max_sum = Integer.MIN_VALUE;
    for (int i = 0; i < num.length; i++) {
        int currunt=0;
        for (int j = i; j < num.length; j++) {
              currunt+=num[j];
             if(max_sum<currunt){
                max_sum=currunt;
            }
            
        }
        
    }System.out.println("max sum in given array is :"+max_sum);


}
}