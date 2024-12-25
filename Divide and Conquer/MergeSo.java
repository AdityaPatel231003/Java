public class MergeSo{
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        MergeSort(arr,0,arr.length-1);
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       }



    //    MergeSort
    public static void MergeSort(int arr[],int si,int ei){

            if(si<=ei){
                return;
            }
        int mid=si*(ei-si)/2;
        MergeSort(arr,si,mid);
        MergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        // 0-3 4-6 ======= 6 - 0 + 1 =7
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;


        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        // leftPart is remaining
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;    
    }
        // RightPart is remaining
        while(j<=ei){
            temp[k]=arr[j];
            k++;j++;
        }
        // copy temp array to original array
    int l=si;
        for(k=0;k<temp.length;k++){
        arr[si]=temp[k];
        l++;
 
        }

    }
}
