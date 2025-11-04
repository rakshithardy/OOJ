import java.util.Scanner;
class InputScanner{
    Scanner sc=new Scanner(System.in);
} 
abstract class shape extends InputScanner{
    int dim1,dim2;
    abstract void input();
    abstract void printArea();
}
class Rectangle extends shape{
    void input(){
        System.out.println("Enter the dimensions of the rectangle(length and breadth):");
        dim1=sc.nextInt();
        dim2=sc.nextInt();
    }
    void printArea(){
        double area=(double)dim1*dim2;
        System.out.println("Area of the rectangle:"+area);
    }
}
class Circle extends shape{
    void input(){
        System.out.println("Enter the dimensions of the circle(radius):");
        dim1=sc.nextInt();
    }
    void printArea(){
        double area=Math.PI*dim1*dim1;
        System.out.println("Area of the circle:"+area);
    }
}
class Triangle extends shape{
    void input(){
        System.out.println("Enter the dimensions of the triangle(base and height):");
        dim1=sc.nextInt();
        dim2=sc.nextInt();
    }
    void printArea(){
        double area=0.5*dim1*dim2;
        System.out.println("Area of the triangle:"+area);
    }
}
public class Abstractdemo{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.input();    
        Triangle t = new Triangle();
        t.input();    
        Circle c = new Circle();
        c.input();
        r.printArea();
        t.printArea();
        c.printArea();
    }
}