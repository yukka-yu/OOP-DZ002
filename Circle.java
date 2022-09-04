public class Circle extends Figure{
    private Double radius;

    public Circle(Double radius){
        if(radius <= 0){
            throw new IllegalArgumentException("Радиус должен быть положительным!");
            }
        this.radius = radius;
    }
    
    @Override
    public Double getP(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public Double getS(){
        return Math.PI * radius * radius;
    }
}
