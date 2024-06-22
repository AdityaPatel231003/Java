public class Binary {
    public static int   BinarySearch( int arr[],int key){
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            start++;
            end--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=7;
        int index=BinarySearch(arr,key);

        if(index==-1){
            System.out.println("Not found [index=>] :"+index);

        }
        else System.out.println("found at Index:"+index);

    }
    
}
