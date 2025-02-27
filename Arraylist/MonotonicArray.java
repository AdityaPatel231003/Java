import java.util.ArrayList;

public class MonotonicArray {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(5);  n.add(1);  n.add(9);  n.add(15);

       System.out.println( Monotonic(n));
    }
    public static boolean Monotonic(ArrayList<Integer>n){
        boolean Inc=true;
        boolean Dec=true;
        for(int i=0;i<n.size()-1;i++){
            if(n.get(i)>n.get(i+1)){
                Inc= false;
            }
            if(n.get(i)<n.get(i+1)){
                Dec=false;
            }
        }
        return Inc || Dec;


    }
    
}
