public class MaximumWaterTrapped {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        Bruteforce(height);
        NComplexity(height);
    }
    public static void Bruteforce(int h[]){
        int maxarea=0;
        for(int i=0;i<h.length;i++){
            for(int j=i+1;j<h.length;j++){
                int height=Math.min(h[i],h[j]);
                int breadth=Math.abs(j-i);
                int area=height*breadth;
                maxarea=Math.max(maxarea,area);

            }
        }
        System.out.println(maxarea);
    }
    public static void NComplexity(int h[]){
        int left=0;
        int right=h.length-1;
        int maxarea=0;
        while (left<=right) {
         int height=Math.min(h[left],h[right]);
         int breadth=Math.abs(right-left);
         int area=height*breadth;
         maxarea=Math.max(maxarea,area);
            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxarea);
    }
   
    
}
