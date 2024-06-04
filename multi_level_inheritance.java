class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends Shape{
    public void area(int s){
        System.out.println(s*s);
    }
}
public class multi_level_inheritance {
    public static void main(String[] args) {
        Triangle tri=new Triangle();
        tri.area(20,5);
        
    }
}
