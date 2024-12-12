public class MethodOveriding {
    public static void main(String[] args) {
        overridingDerived od=new overridingDerived();
        od.eat();
        od.setheight(32);
        System.out.println(od.h);
        
    }
}
class overridingBase{
    void eat(){
        System.out.println("eat");
    }
    int h;
    int height(){
        return this.h;
    }
    void setheight(int h){
        this.h=h;

    }

}

class overridingDerived extends overridingBase{
    void eat(){
        System.out.println("eat fruits");
    }
    int h;
    int height(){
        return this.h;
    }
    void setheight(int h){
        this.h=h;

    }


}
