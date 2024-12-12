public class DeepShallowCopy {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks=new int[3];
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        for(int i=0;i<s1.marks.length;i++){
            System.out.print(s1.marks[i] +" ");
        }
        System.out.println();


        Student s2=new Student(s1);
        s1.marks[2]=100;
        for(int i=0;i<s2.marks.length;i++){
            System.out.print(s2.marks[i] +" ");
        }

        
        
    }
    
}
class Student{
    int marks[];
    Student(){
        }
        // Shallow  Copy => s2 marks referces/point towards  s1 marks
    //  Student(Student s1){
    //         marks=new int[3];
    //         this.marks=s1.marks;
            
    //     }


// Deep Copy refernces Show
    Student(Student s1){
        marks=new int[3];
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
       
        
    }

}