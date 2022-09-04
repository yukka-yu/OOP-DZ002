public class Square extends Figure{
    Double side;

    public Square(Double side){
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть положительной!");
        }
        this.side = side;
    }

    public Double getP(){
        return 4 * side; 
    }
    public Double getS(){
        return side * side;
    }
}
