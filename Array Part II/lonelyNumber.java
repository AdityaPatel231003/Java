import java.util.ArrayList;
import java.util.Arrays;

public class lonelyNumber {
    public static void main(String[] args) {
        int arr[]={1,6,5,5,-3,2,2};
        System.out.println(lonely(arr));

    }
    public static ArrayList<Integer> lonely(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]&&arr[i+1]!=arr[i]+1){
                    list.add(arr[i]);
                }
            }
            else if(i==arr.length-1){
                if(arr[i]!=arr[i-1]&&arr[i-1]!=arr[i]-1){
                    list.add(arr[i]);
                }
            }
            else{
                if(arr[i]!=arr[i+1]&&arr[i+1]!=arr[i]+1
                && arr[i]!=arr[i-1]&&arr[i-1]!=arr[i]-1){
                    list.add(arr[i]);
                }
            }
            }
            return list;
        }
    
}
