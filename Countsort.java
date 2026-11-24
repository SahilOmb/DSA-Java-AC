public class Countsort {
    public static void main(String[] args) {
         int arr[]={1,4,12,67,23,56,49,89};
        Countsort cnt = new Countsort();
        cnt.CountingSort(arr);
    }
    private void CountingSort(int arr[]){
       int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest = arr[i];
        }
        }
         int count[] = new int[largest+1];
         for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;  
        }
        //sorting
        int j =0;
        for(int i = 0; i < count.length; i++){
          while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
        printArr(arr);
    }
      private void printArr(int arr[]) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }
}







