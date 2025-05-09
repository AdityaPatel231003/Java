import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class JCF {
    public static void main(String[] args) {
        Queue <Integer>q=new LinkedList<>();

        q.add(101); q.add(1);  q.add(2);  q.add(3);  q.add(4);  q.add(5);
        while (!q.isEmpty()) {
            System.out.println( q.peek());
             q.remove();   
         }
// LinkedLists  doublyLinkedLists
// LinkedLists class implements queue and lists so get specific index in O(n)  less memory efficient  because of null element or due to overhead storing of reference
// ArrayDeque class implements queue more memory efficient 


         Queue <Integer>Aq=new ArrayDeque<>();
         Aq.add(101); Aq.add(1);  Aq.add(2);  Aq.add(3);  Aq.add(4);  Aq.add(5);
        while (!Aq.isEmpty()) {
            System.out.println( Aq.peek());
             Aq.remove();   
         }


    }
    
}
