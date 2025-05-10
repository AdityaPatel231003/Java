import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
     public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
       
        q.add(1);
        q.add(2);
        q.add(3);  q.add(4);
        q.add(5); q.add(6);
        q.add(7);
        q.add(8);  q.add(9);
        q.add(10);

        interleave(q);
        while (!q.isEmpty()) {
            System.out.print(" "+q.remove());
        }

    }
    public static void interleave(Queue <Integer> q){
        // TC :- O(n)
        // SC :- O(n)
         Queue<Integer>firstq=new LinkedList<>();
         int Size=q.size();
         for (int i = 0; i < Size/2; i++) {
            firstq.add(q.remove());
         }
         while (!firstq.isEmpty()) {
            q.add(firstq.remove());
            q.add(q.remove());
            
         }
    }
    
}
