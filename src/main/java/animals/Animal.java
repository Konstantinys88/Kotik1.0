package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal {

    public String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public abstract int getSatiety();

    public abstract Size getSize();


}
