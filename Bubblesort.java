public class Bubblesort {
    public static void main(String[] args) {
        int arr[]={1,4,12,67,23,56,49,89};
        Bubblesort bub = new Bubblesort();
        bub.BubbleSort(arr);
    }

    private void BubbleSort(int arr[]){
        for (int idx = 0; idx < arr.length; idx++) {
            for (int pos = 0; pos < arr.length-1-idx; pos++) {
                if(arr[pos]>arr[pos+1]){
                    int temp = arr[pos];
                    arr[pos]=arr[pos+1];
                    arr[pos+1]=temp;
                }
            }
        }   printArr(arr);
    }

    private void printArr(int arr[]){
        for(int nums : arr){
            System.out.print(nums +" ");
        }

    }
}
