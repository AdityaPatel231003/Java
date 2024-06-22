public class Prefix_Max_subArray {
    public static void  Max_sub_array(int arr[]){

        int prefix[]=new int [arr.length];
        prefix[0]=arr[0];
        
        for(int i=1;i<prefix.length;i++){
            System.out.println(prefix[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                prefix[i]=prefix[prefix.length-1]

            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        Max_sub_array(arr);
    }
}
