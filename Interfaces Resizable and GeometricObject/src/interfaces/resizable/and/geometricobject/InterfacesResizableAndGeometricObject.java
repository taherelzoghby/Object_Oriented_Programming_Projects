package interfaces.resizable.and.geometricobject;
public class InterfacesResizableAndGeometricObject {
    public static void main(String[] args) {
        circle c1=new circle(12.5);
        System.out.println("Area : "+c1.getArea());
        System.out.println("Perimeter : "+c1.getPerimeter());
        System.out.println(c1);
        resizeableCircle r1=new resizeableCircle(12.5);
        r1.resize(30);
        System.out.println(r1);
    }
    
}
