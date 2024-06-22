import java.util.*;
public class linear{
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[3];
        System.out.println("Enter array :");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter key :");
        int key =sc.nextInt();

        int index=linearSearch(arr, key);
        if(index==-1){
            System.out.println("Not found [index=>] :"+index);

        }
        else System.out.println("found at Index:"+index);


    }
}