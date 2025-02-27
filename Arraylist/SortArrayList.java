import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(8);
       list.add(6);
       list.add(2);
       list.add(5);
       list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        Collections.sort(list);
        System.out.println("Ascending Order :"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descnending Order :"+list);


    }
    
}
