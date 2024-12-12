public class MethodOverloading {
    public static void main(String[] args) {
        overloading ov1=new overloading("aditya");
        overloading ov2=new overloading("23");
        
        System.out.println(ov1.Sum(2,3));
        System.out.println(ov2.Sum(2.3f,4.5f));
    }
    
}
class overloading{
    // constructor overloaading
    String name;
    int roll;
   
    overloading(String name){
       System.out.println(name);


    }
    overloading(int roll){
        this.roll=roll;

    }

    // Method overloading
    public float Sum(float a,float b){
        return a+b;
    }
    public int Sum(int a,int b){
        return a+b;
    }
   
}