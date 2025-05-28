import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class ChocolaProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int m= sc.nextInt();
        int n=sc.nextInt();

        Integer VerticalCost[]=new Integer[m-1];
         for (int i = 0; i < VerticalCost.length; i++) {
            VerticalCost[i]=sc.nextInt();
            
        }
        Integer HorizontalCost[]=new Integer[n-1];
        for (int i = 0; i < HorizontalCost.length; i++) {
            HorizontalCost[i]=sc.nextInt();
        }


        Arrays.sort(VerticalCost,Collections.reverseOrder());
          Arrays.sort(HorizontalCost,Collections.reverseOrder());

          int h=0,v=0;
          int hp=1,vp=1;
          int cost=0;
        for(int i=0;i<test;i++){while(h<HorizontalCost.length && v<VerticalCost.length){
            if(VerticalCost[v]>=HorizontalCost[h]){
                cost+=(VerticalCost[v]*hp);
                v++;
                vp++;
            }
            else{
                cost+=(HorizontalCost[h]*vp);
                h++;
                hp++;
            }
          }


           while( v<VerticalCost.length){
                cost+=(VerticalCost[v]*hp);
                v++;
                vp++;
          }
           while(h<HorizontalCost.length ){ 
                cost+=(HorizontalCost[h]*vp);
                h++;
                hp++;
          }
        }
          


System.out.println(cost);
sc.close();
    }
   
}
