
package interfaces.resizable.and.geometricobject;
public class circle implements GeometricObject {
    protected double radius;

    public circle() {
    }

    
    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + '}';
    }
    

    @Override
    public double getArea() {
         return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    
}
