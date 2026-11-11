public class InsertionSort {
    public static void main(String[] args) {
         int arr[]={1,4,12,67,23,56,49,89};
        InsertionSort in = new InsertionSort();
        in.insertionSort(arr);
    }
    private void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
          for (int j = i; j > 0  ; j--) {
              if(arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
              }else{
                break;
              }
          }
        }printArr(arr);
    }
      private void printArr(int arr[]) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }
}





