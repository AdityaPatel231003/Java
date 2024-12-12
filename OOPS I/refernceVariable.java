public class refernceVariable {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.print();
        

        
    }
    
}
class Vehicle{
    void print(){
        System.out.println("Base class vehicle called");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("derived Class caar is called");
    }
}