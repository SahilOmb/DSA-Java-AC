public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {1, 4, 12, 67, 23, 56, 49, 89};
        SelectionSort sel = new SelectionSort();
        sel.selectionSort(arr); 
    }

    private void selectionSort(int arr[]) {
        for (int idx = 0; idx < arr.length - 1; idx++) {
             int minpos = idx;
            
            for (int j = idx ; j < arr.length; j++) {
                if (arr[j] < arr[minpos]) {
                    arr[minpos] = arr[j]; 
            }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[idx];
            arr[idx] = temp;
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
