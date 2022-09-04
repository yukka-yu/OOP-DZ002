import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String [] args){

        List<Figure> figures = new ArrayList<>();
        figures.add(new Triangle(2.0, 3.0, 2.0));
        figures.add(new Circle(3.0));
        figures.add(new Rectangle(2.0, 6.0));
        figures.add(new Square(4.0));

        System.out.println(figures.get(0).getP()); 
        System.out.println(figures.get(0).getS()); 

        
        System.out.println(figures.get(1).getP()); 
        System.out.println(figures.get(1).getS());


    }
    
}
