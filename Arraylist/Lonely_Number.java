import java.util.ArrayList;
import java.util.Arrays;
public class Lonely_Number {
    public static void main(String[] args) {
      
        int arr[]={1,3,5,3};
       
        ArrayList<Integer>lista = Call(arr);
        System.out.println(lista);
    }
    public static ArrayList Call(int []arr){
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        int lp=0;
        int rp=arr.length-1;
        if(lp==rp){
            list.add(arr[lp]);
            return list;
        }

       for(int i=0;i<arr.length;i++){
        if(i==0){
            if(arr[i+1]!=arr[i]+1 && arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }

        }

        else if(i==arr.length-1){
            if(arr[i-1]!=arr[i]-1 && arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }

        }
        else if(i!=0 && i!=arr.length-1){
            if(arr[i+1]!=arr[i]+1 && arr[i]!=arr[i+1]&& arr[i-1]!=arr[i]-1 && arr[i]!=arr[i-1] ){
                list.add(arr[i]);
            }

        }

       }
       return list;
    }
    
}
