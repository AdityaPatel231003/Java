public class SearchInRotedArray {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=5;
        System.out.println(search(nums,target));
    }
    
        public  static int search(int[] nums, int target) {
            int ans=SR(nums ,0, nums.length-1, target);
            return ans;
        }
        public static int  SR(int arr[],int si ,int ei ,int target){
            if(si>ei){
                return -1;
            }
            int mid=((si+ei)/2);
            System.out.println(mid);
            if(arr[mid]==target){
                return mid;
            }
    
            if (arr[si]<=arr[mid]){
                if(arr[si]<=target && target<=arr[mid]){
                    return SR(arr,si,mid-1,target);
                }
                else{
                    return SR(arr,mid+1,ei,target);
                }
            }
            else {
                if(arr[mid]<target && target<=arr[ei]){
                        return SR(arr,mid+1,ei,target);
                }
                else{
                    return SR(arr,si,mid-1,target);
                }
            }
           
        }
    
}
