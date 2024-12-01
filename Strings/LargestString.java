public class LargestString {
    public static void main(String[] args) {
        //  by lexicography
        // O(x*n)
        String fruits[]={"apple","Mangoe","Banana" ,"Grapes"};
        String largest=fruits[0].toLowerCase();
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
              largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
