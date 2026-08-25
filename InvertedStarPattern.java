
public class InvertedStarPattern {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {         //as i decrease for each loop like reverse count down 4-3-2-1
            for (int j = 1; j <= i; j++) {     // Because the loop condition is the maximum value j can reach changes
                System.out.print("*");         // on each row eg 1 line is 1 to 4 and last is 1 to 1 
            }   System.out.println();
        }
    }
    


}
