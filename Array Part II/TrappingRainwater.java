public class TrappingRainwater {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int trappedwater=0;
        int width=1;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(left[i],right[i]);
            trappedwater+=(waterlevel-height[i])*width;
        }
        System.out.println("Trapped water is => "+trappedwater);
    }
    
}
