public class Rectangle extends Figure{
    Double side1, side2;

    public Rectangle(Double side1, Double side2){
        if (side1 <= 0 || side2 <= 0){
            throw new IllegalArgumentException("Обе стороны прямоугольника должны быть положительны!");
        }
            
        this.side1 = side1;
        this.side2 = side2;
    }

    public Double getP(){
        return 2  * (side1 + side2);
    }

    public Double getS(){
        return side1 * side2;
    }
    
}
