
public class Bark {

    private final String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public boolean Equals(Bark bark) {
        if (bark instanceof Bark) {
            Bark otherBark = new Bark(bark.sound);
            if (this.sound.equalsIgnoreCase(otherBark.sound)) {
                return true;
            }
        }
        return false;
    }
}
