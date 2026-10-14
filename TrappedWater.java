public class TrappedWater {
    protected int TrappedRainWater(int[] height){
        int n = height.length;
      //first calculate left and right max array using auxilary arrays
      int leftmax[]= new int[height.length];
      leftmax[0]=height[0];
      for (int l = 1; l < height.length; l++) {
          leftmax[l]= Math.max(height[l],leftmax[l-1]);
      }
     
      int rightmax[]= new int[height.length];
      rightmax[n-1]=height[n-1];
      for (int r=n-2; r >= 0; r--) { 
          rightmax[r]= Math.max(height[r],rightmax[r+1]); 
      }

      //then run a loop to get the water level which is min of 2 arrays
      int trapperwater=0;
      for (int i = 0; i < n; i++) { 
          int waterlevel =Math.min(leftmax[i],rightmax[i]);
           //trapped water = waterlevel - height[i]
          trapperwater += waterlevel - height[i];
      }
        return trapperwater;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        TrappedWater tw = new TrappedWater();
        System.out.println("Total trapped water is:"+tw.TrappedRainWater(height));
    }
}
