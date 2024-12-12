public class Constructor {
    public static void main(String[] args) {
        Student std=new Student();
        Student std2=new Student("Ram");
        System.out.println(std2.name);
        
    }
    
}
class Student{
    String name;
    int roll;
    Student(){

    }
    Student(String name){
        this.name=name;
    }

}
