// if a number of classes derived from single base
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println(0.5*b*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
/**
 * heirarchical_inheritance
 */
public class heirarchical_inheritance {

    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.area(20,5);

        Circle c1=new Circle();
        c1.area(12);
        
    }
}