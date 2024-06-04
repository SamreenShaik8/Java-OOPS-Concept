class Student{
    String name;
    int age;

    // default constructer
    public Student() {

    }
    public void displayinfo(String name){
        System.out.println(name);
    }
    public void displayinfo(int age){
        System.out.println(age);
    }
    public void displayinfo(String name,int age){
        System.out.println(name+""+age);
    }
}
public class compile {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="samreeen";
        s1.age=21;
        s1.displayinfo(s1.name, s1.age);
    }
    
}
