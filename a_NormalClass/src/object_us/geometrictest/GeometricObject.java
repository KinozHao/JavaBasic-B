package object_us.geometrictest;

/**
 * @author kinoz
 * @date 2022/4/8 - 19:44
 * @apiNote
 */
public class GeometricObject {
    private String color;   //颜色
    private double weight;  //重量

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public GeometricObject(String color) {
        this.color = color;
    }

    public GeometricObject() {
    }

    public double findArea(){
        return 0;
    }
}

class Circle extends GeometricObject{
    private double radius;  //半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public Circle(String color){
        super(color);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {  //圆面积公式
        return  Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

}

class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width,double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {  //矩形面积公式
        return height * width;
    }
}


