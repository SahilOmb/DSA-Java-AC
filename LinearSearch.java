public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,7,45,61,12,51,77,98,3};
        int key = 12;
        LinearSearch ls = new LinearSearch();
        int result = ls.LinearSearch(arr, key);
        if(result != -1){
            System.out.println("found it at :"+ result);
        }else{
            System.out.println("not found ");
        }
    }

    public int LinearSearch(int arr[],int key){
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]==key){
            return idx;
            }
        }
        return -1;
    }
}
