package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Herbivore extends Animal {


    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Eст");
            this.satiety += ((Meat) food).getEnergy();
        } else throw new WrongFoodException();
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
