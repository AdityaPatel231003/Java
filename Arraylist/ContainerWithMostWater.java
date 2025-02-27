import java.util.ArrayList;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


      int ans=  Water(height);
      System.out.println(ans);
    }
    public static int Water(ArrayList<Integer> height){
        int LeftPointer=0;
        int RightPointer=height.size()-1;
        int max=Integer.MIN_VALUE;
        while (LeftPointer<=RightPointer) {
            int h=Math.min(height.get(LeftPointer), height.get(RightPointer));
            int width=Math.abs(RightPointer-LeftPointer);
            int area=h*width;
          max=  Math.max(area,max);
          if(LeftPointer<=RightPointer){
            LeftPointer++;
          }
          else{
            RightPointer--;
          }
            
        }
        return max;
    }
}