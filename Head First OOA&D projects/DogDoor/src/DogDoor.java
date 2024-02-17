
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean openDoor;
    ArrayList<Bark> allowedBark;

    public DogDoor() {
        this.openDoor = false;
        this.allowedBark = new ArrayList();
    }

    public void open() {
        System.out.println("Door is open");
        openDoor = true;
        // close door automatically after 5 seconds....
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("Door is close");
        openDoor = false;
    }

    public boolean isOpen() {
        return openDoor;
    }

    void setAllowedBark(Bark b) {
        allowedBark.add(b);
    }

    ArrayList<Bark> getAllowedBark() {

        return allowedBark;
    }
}
