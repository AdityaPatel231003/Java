public class ConstructorInAbstractclass {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
        System.out.println(h.ChangeColor());
        System.out.println(h.color);
        h.walk();
        h.eat();
    }
    
}
abstract class Animal{
    String name;
    void eat(){
        System.out.println("animal eats");
    }
   
    String color="black";
    Animal(){
        System.out.println("Base class constructor called :");
        this.name="badal";
    }
    
   
}
class Horse extends Animal{
   
    String ChangeColor(){
        return this.color="white";
    }
    void walk(){
        System.out.println("animal walk");
    }
    Horse(){
        System.out.println("Derived class constructor called :");
    }
}
