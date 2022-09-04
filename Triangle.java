public class Triangle extends Figure{
    Double side1;
    Double side2;
    Double side3;

    public Triangle(Double side1, Double side2, Double side3){
            if(side1 + side2 <= side3 ||
                    side2 + side3 <= side1 ||
                    side1 + side3 <= side2){
                throw new IllegalArgumentException("Это уже не треугольник получается!");
            }
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    @Override
    public Double getP() {
        return side1 + side2 + side3;
        }

    @Override
    public Double getS() {
        double p = getP() / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }

}
