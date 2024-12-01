public class NoVowels {
    
    public static void main(String[] args) {
        String str=new String("antbodycandance");
        int count=0;
        for(int i=0;i<str.length();i++){
            int newstr=str.charAt(i);
            if(newstr=='a' ||newstr=='e'||newstr=='i' || newstr=='o' || newstr=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
