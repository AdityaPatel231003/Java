import java.util.ArrayList;

public class PairSum_In_Roted_Sorted_Array {
    public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target=16;
        System.out.println(list);
        boolean ans=Call(list,target);
        System.out.println(ans);
    }
    public static boolean Call( ArrayList<Integer> list,int tar){
int breakingPoint=0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                    breakingPoint=i;
                    break;
            }
        }
        int lp=breakingPoint+1;
        int rp=breakingPoint;
        int n=list.size();
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==tar){
                return true;
            }
            if(list.get(lp)+list.get(rp)<tar){
                lp=(lp+1)%n;
            }
            if(list.get(lp)+list.get(rp)>tar){
                rp=(rp-1+n)%n;
            }
        }
        return false;

    }
    
}
