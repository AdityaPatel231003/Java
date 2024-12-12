public class Statickeywaord {
    public static void main(String[] args) {
        Animal an=new  Animal();
        Animal sn=new Animal();

        an.rollno=23;
        an.SchoolName="ABC";

        System.out.print("static Variable :   ");
        System.out.print(an.SchoolName +" ");
        System.out.print(sn.SchoolName +" ") ;
        System.out.print(Animal.SchoolName +" ");
        System.out.println(Horse.SchoolName +" ");


        System.out.println("Non static variable :    ");
        System.out.print(an.rollno + " ");
        System.out.println(sn.rollno);
       
    }
    
}
class Animal{
    String name;
    int rollno;
   static  String SchoolName;

   void print(){
    System.out.println("print ");
   }

}
class Horse extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}