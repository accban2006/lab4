
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }

    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println(resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        resizableCircle.resize(50); // Resize to 50%
        System.out.println("\nAfter resizing to 50%:");
        System.out.println(resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        resizableCircle.resize(200); // Resize to 200%
        System.out.println("\nAfter resizing to 200%:");
        System.out.println(resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}