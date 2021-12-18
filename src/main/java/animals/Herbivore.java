package animals;
import model.Size;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public int getSatiety() {
        return 0;
    }

    @Override
    public Size getSize() {
        return null;
    }
}
