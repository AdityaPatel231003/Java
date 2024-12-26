public class SearchInSortedArray {
    public static void main(String[] args) {
        String str[]={"sun","earth","Mercury","Mars"};
        MergeSort(str,0,str.length-1);
        // print(str);
        for( int k=0;k<str.length;k++){
            System.out.println(str[k]);
        }
    }
    public static void MergeSort(String str[],int si,int ei){
        
if(si>=ei){
    return ;
}
        int mid=si+(ei-si)/2;
        MergeSort(str,si,mid);
        MergeSort(str, mid+1, ei);
        Merge(str,si,mid,ei);
    }
    public static void Merge(String str[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int k=0;

        int i=si;
        int j=mid+1;

        while ((i<=mid && j<=ei)) {
            

            if((str[i].compareToIgnoreCase(str[j]))<0){
                temp[k]=str[i];
                k++;
                i++;
               
            }
            else{
                temp[k]=str[j];
                j++;
                k++;    
            }
            
        }
        while(i<=mid){
            temp[k]=str[i];
            k++;
            i++;
            
        }
        while(j<=ei){
            temp[k]=str[j];
            k++;
            j++;
           
        }

        // Copy to oiginnal String arr
       
        for( int kM=0,l=si;kM<temp.length;kM++){
            str[l]=temp[kM];
           
            l++;
        }
    }
    // public static void print(String str[]){
    //     for( int k=0;k<str.length;k++){
    //         System.out.println(str[k]);
    //     }
    // }
}
