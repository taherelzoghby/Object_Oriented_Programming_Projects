
package ex6.pkg3;
public class movablePoint implements movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public movablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "("+xSpeed+","+ySpeed+")  speed ("+x+","+y+")";
    }

    
    @Override
    public void moveUp() {
        y-=ySpeed;
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }
    
}
