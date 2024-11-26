public class MaxSubarrays {

    public  static void Bruteforce(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=arr[k];

                }
                maxsum=Math.max(maxsum, currentsum);
            }
        }
        System.out.println(maxsum);
    }
    public static void  Prefixarray(int arr[]){
        int prefix[]=new int[arr.length];
        int maxsum=Integer.MIN_VALUE;

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }

        for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum= i==0? prefix[j] : prefix[j]-prefix[i-1];
            maxsum=Math.max(sum, maxsum);
        }
    }
        System.out.println(maxsum);
    }

    public static void KadanesAlgorithms(int arr[]){
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(currentsum<0){
                currentsum=0;
            }
        }
        System.out.println(currentsum);
    }

    public static void KadanesAlgorithmsNegative(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int arr[]={-2,-5,-1,-7};
        Bruteforce(arr);
        Prefixarray(arr);
        KadanesAlgorithms(arr);
        // if all numbers are negative then
        KadanesAlgorithmsNegative(arr);
    }
    
}
