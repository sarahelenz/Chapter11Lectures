public class Rectangle {
    private double height;
    private double width;

    public Rectangle(){
        height = 1;
        width = 1;
    }
    public Rectangle(double h, double w){
        this.height = h;
        this.width = w;
    }
    public double getArea(double h, double w){
        return h * w;
    }

}
