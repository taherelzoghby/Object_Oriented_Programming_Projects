package ex6.pkg3;
public class movableCircle  extends movablePoint {
   private int radius;
   movablePoint center;

    public movableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "("+xSpeed+","+ySpeed+")  speed ("+x+","+y+")"+ "-radius=" + radius ;
    }
    
   
       @Override
    public void moveUp() {
        y-=radius;
    }

    @Override
    public void moveDown() {
        y+=radius;
    }

    @Override
    public void moveRight() {
        x+=radius;
    }

    @Override
    public void moveLeft() {
        x-=radius;
    }
}
