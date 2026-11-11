public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int key = 70;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.BinarySearch(arr, key));
    }
    private int BinarySearch(int arr[], int key){
         int start =0, end = arr.length-1, count=0;
         
         while(start<=end){
             count++;
               System.out.println("count is :"+count);

            int mid = (start + end) /2;
            if(arr[mid]== key){
                return mid; 
            }
            if(key > arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            } 
              
         }return -1;
    }
}

