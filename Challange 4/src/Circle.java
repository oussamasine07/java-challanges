public class Circle extends Shape {

    public double r;

    Circle ( double r ) {
        this.r = r;
    }

    public double area () {
        return Math.PI * Math.pow( this.r, 2 );
    }

    public double perimeter () {
        return 2 * Math.PI * this.r;
    }
}
