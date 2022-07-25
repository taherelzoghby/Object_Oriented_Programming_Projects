package interfaces.resizable.and.geometricobject;
public class resizeableCircle extends circle implements Resizeable{

    public resizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "resizeableCircle{" + "circle[radius=" + radius + "]"+'}';
    }
    @Override
    public void resize(int percent) {
        radius*=(percent/100.0);
    }
    
}
