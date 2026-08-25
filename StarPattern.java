public class StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      //outer loop --y axis
            for (int j = 1; j <= i; j++) {    // inner loop --x axis 
                System.out.print("*");       // print the actual stars on each line
            }   System.out.println();            //adds new line ever loop
        }

    }
}
