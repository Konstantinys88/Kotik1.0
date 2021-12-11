package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {


    @Override
    public int eat(Food food) {
        return 0;
    }
}
