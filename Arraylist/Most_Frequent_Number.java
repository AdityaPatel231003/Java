import java.util.ArrayList;

public class Most_Frequent_Number {

    public static void main(String[] args) {
         ArrayList<Integer> n=new ArrayList<>();
        n.add(1);  n.add(5);  n.add(1);  n.add(4);  n.add(3);
        n.add(1);  n.add(3);  n.add(2); n.add(1);  n.add(3); n.add(5);

        int key=1;
       System.out.println( MostFreq(n,key));
    }
    public static int MostFreq(ArrayList<Integer> nums,int key){
        int Count[]=new int[1001];

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==key){
                Count[nums.get(i+1)]++;
            }
        }

        int max=Integer.MIN_VALUE;
        int tar=0;
        for(int i=0;i<Count.length;i++){
            if(max<Count[i]){
                max=Count[i];
                tar=i;
            }
        }
        return tar;
    }
}