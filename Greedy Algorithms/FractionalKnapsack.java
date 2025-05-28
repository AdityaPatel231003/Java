import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
       
       double ratio[][]=new double[value.length][3];
        for (int i =0; i <value.length; i++) {
            ratio[i][0]=value[i];
             ratio[i][1]=weight[i];
            ratio[i][2]=value[i]/(double)weight[i];
        }

         // Arrange Ratio in ascending order
        // then loop from n to 0
        int cap=w;
        int profit=0;

           Arrays.sort(ratio,Comparator.comparingDouble(o->o[2]));
           for (int i = value.length-1; i >=0; i--) {
            if (cap>=ratio[i][1]) {
                profit+=ratio[i][0];
                cap-=ratio[i][1];
                
            }
            else{
                profit+=(ratio[i][0]*cap)/(ratio[i][1]);
                cap=0;
                break;
            }
           }
           System.out.println("Profit "+profit);
    }
}
