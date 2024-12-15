public class Rectangle {

    public double width;
    public double length;

    Rectangle ( double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area () {
        return this.width * this.length;
    }

    public double perimeter () {
        double calcPerimeter = 0;
        if (this.width == this.length) {
            calcPerimeter = this.width * 4;
        }

        if ( this.width == this.length ) {
            calcPerimeter = (this.width * 2) + (this.length * 2);
        }
        return calcPerimeter;
    }
}
