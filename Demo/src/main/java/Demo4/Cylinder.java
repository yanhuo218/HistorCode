package Demo4;

public class Cylinder  extends Circle{
    private double height;
    public Cylinder(){

    }
    public Cylinder(double r,double height) {
        super.setRadius(r);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }
    public void showVolume(){
        super.show();
        System.out.println("圆柱体的体积:"+ this.getVolume());
    }

}
