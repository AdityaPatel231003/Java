public class Abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        Mustang md=new Mustang();
        md.walk();
        md.eat();
        h.eat();
        
    }
    
}
abstract class Animal{
    // Non abstract methods
    void eat(){
        System.out.println("Animal eat anything");
    }
    // Abstract methods
   abstract void walk();



}
// hierarchial Inheritance
class Horse extends Animal{
    void walk(){
        System.out.println("horse walk on 4 legs");
    }
}
class Mustang extends Animal{
    void walk(){
        System.out.println("Mustang also walk on 4 legs");
    }
}