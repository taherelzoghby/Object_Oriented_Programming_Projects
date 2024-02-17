
import java.util.ArrayList;

public class barkRecognizer {

    private final DogDoor door;

    public barkRecognizer(DogDoor door) {
        super();
        this.door = door;
    }

    public void barkReco(Bark bark) {
        System.out.println("Bark recognizer found : " + bark.getSound());
        ArrayList bar_k = door.getAllowedBark();
        for (int i = 0; i < bar_k.size(); i++) {
            Bark b=(Bark)bar_k.get(i);
            if (b.Equals(bark)) {
                door.open();
                return;
            }
        }
        System.out.println("The door is not allowed");
    }
}
