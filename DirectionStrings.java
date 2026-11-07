public class DirectionStrings {
    public static void main(String[] args) {
        String dir= "weessnssewsss";
        int x = 0;
        int y = 0;
         for (int i = 0; i < dir.length(); i++) {
             char dir1 = dir.charAt(i);
             if(dir1 == 'n'){
                y++;
             }
             else if(dir1 == 's'){
               y--;
             }
             else if(dir1 == 'e'){
                x++;
             }
             else{
               x--;
             }
             
         }System.out.println(x+" "+y);
         double result =Math.sqrt((x*x)+(y*y));
         System.out.println(result);
    }
}
