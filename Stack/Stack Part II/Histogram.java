import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        System.out.println(Area(heights));
    }
    public static int Area(int heights[]){
        int NxtSmallerRigth[]=new int[heights.length];
        Stack<Integer>s=new Stack<>();
        for (int i = heights.length-1; i >=0 ; i--) {
            while (!s.isEmpty() && heights[i]<=heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                NxtSmallerRigth[i]=heights.length;
            }
            else{
                NxtSmallerRigth[i]=s.peek();
            }

            s.push(i);
            
        }

        int NxtSmallerleft[]=new int[heights.length];
        s=new Stack<>();
        for (int i=0;i<heights.length; i++) {
            while (!s.isEmpty() && heights[i]<=heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                NxtSmallerleft[i]=-1;
            }
            else{
                NxtSmallerleft[i]=s.peek();
            }

            s.push(i);
            
        }

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int Width=NxtSmallerRigth[i]-NxtSmallerleft[i]-1;

            int area=heights[i]*Width;
            max=Math.max(max, area);
            
        }
        return max;
    }

   
}
