
public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }//no arg ctor

    public Circle(double radius) {
        this.radius = radius;
    }//end ctor

    public double getRadius() {
        return radius;
    }//end getRadius

    public void setRadius(double radius) {
        this.radius = radius;
    }//end setRadius

    public double circumference() {
        return 2 * Math.PI * radius;
    }//end circumference

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }//end area

    public String getCircleData() {
        String data = "";
        data += "Radius: " + String.format("%.2f", this.getRadius()) + "\n";
        data += "Area: " + String.format("%.2f", this.area()) + "\n";
        data += "Circumference: " + String.format("%.2f", this.circumference()) + "\n";
        // data += "\n";
        return data;
    }
}//end Circle class
















