//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(45);

        System.out.println("the area of a circle is " + circle.area());
        System.out.println("the perimeter of a circle is " + circle.perimeter());

        Rectangle rectangle = new Rectangle(4, 4);
        System.out.println("the area of a rectangle is " + rectangle.area());
        System.out.println("the perimeter of a rectangle is " + rectangle.perimeter());
    }
}