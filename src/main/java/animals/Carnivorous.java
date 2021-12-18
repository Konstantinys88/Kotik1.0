package animals;
import model.Size;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
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
