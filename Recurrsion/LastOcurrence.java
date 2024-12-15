public class LastOcurrence {
    public static void main(String[] args) {
        int arr[]={8,3,7,9,5,10,2,5,3};
        int key=5;

        System.out.println(LO(arr,key,0));
    }
    
    public static int LO(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        int found=LO(arr,key,i+1);
        if(found==-1 && arr[i]==key){
            return i;
        }
        
        return found;
    }
}
