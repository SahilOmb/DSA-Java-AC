public class Arrays {
    //they are collection of elements belonging to a single dataype stored in a contiguous location
    // syntax:  dataType arrayName[] = new dataType[size]
    public static void main(String[] args) {
        int nums[] = new int[3];
        //assigning value 
        nums[0]=10;
            nums[1]=20;
             nums[2]=30;
             System.out.println(nums[2]+nums[1]+nums[0]); 

        //direct value assignment
             String names[] = {"rashmika","alia","shravani"};
             //printing the whole array 
             for (int i = 0; i <= names.length-1; i++){
                 System.out.println(names[i]);
             }
          // changing the values of array
             names[0]="hitori";
             System.out.println(names[0]);

         //passing array as values 


        }
    
    }


