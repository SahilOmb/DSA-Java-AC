public class checkPalindrome {

    private boolean CheckIfPalindrome(String str){
        int start= 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
               return false;
            }start++;
             end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        checkPalindrome cp = new checkPalindrome();
       System.out.println( cp.CheckIfPalindrome(str));
    }
}
