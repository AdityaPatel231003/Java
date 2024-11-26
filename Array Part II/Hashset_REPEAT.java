import java.util.HashSet;

public class Hashset_REPEAT {
    public static void main(String[] args) {
        int num[]={1,2,3,1};
     System.out.println(  Bruteforce(num));
     System.out.println(NComplexity(num));
    }
    public static boolean Bruteforce(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean NComplexity(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;

    }
}
