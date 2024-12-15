public class FirstOcuurence {
    public static void main(String[] args) {
        int arr[]={8,3,7,9,5,10,2,5,3};
        int key=5;

        System.out.println(FO(arr,key,0));
    }
    
    public static int FO(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FO(arr,key,i+1);
    }
}
