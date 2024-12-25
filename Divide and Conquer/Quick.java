
public class Quick{
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
       QuickSort(arr,0,arr.length-1);
        print(arr);
    }
   public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }
//  quick Sort function
   public static void QuickSort(int arr[],int si,int ei){

    if(si>=ei){
        return;
    }

    int PivotIdx=Partition(arr,si,ei);
    QuickSort(arr, si, PivotIdx-1);
    QuickSort(arr, PivotIdx+1, ei);


   }
   public static int Partition(int arr[],int si,int ei){
    int Pivot=arr[ei];
    int i=si-1;
    for(int j=si;j<=ei;j++){
        if(arr[j]<Pivot){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

        }
        if(arr[j]==Pivot){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            return i;
        }
    
    }
  return 1;
   }
}
