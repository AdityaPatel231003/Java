import java.util.ArrayList;

public class BeautyFulArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=4;
        list.add(1);
        System.out.println(list);
        while(list.size()<n){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                if(((2*list.get(i))-1)<=n){
                    // odd
                    temp.add((2*list.get(i))-1);
                }  

            }

            for(int j=0;j<list.size();j++){
                if((2*list.get(j))<=n){
                    // even
                    temp.add((2*list.get(j)));
                }
            }
            list=temp;
            System.out.println(list);
        }
        System.out.println("BeautyFulArrayList");
        System.out.println(list);
    }
    
}
