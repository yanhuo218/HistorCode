package Demo4;

public class Circle {
    private double radius;
    private final double pi = 3.14;
    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (pi*radius)*(pi*radius);
    }
    public double getPerimeter(){
        return 2*(pi*radius);
    }
    public void show(){
        System.out.println("圆的半径:" + this.radius);
        System.out.println("圆的周长:" + this.getPerimeter());
        System.out.println("圆的面积:" + this.getArea());
    }
}
