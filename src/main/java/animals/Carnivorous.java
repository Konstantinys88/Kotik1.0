package animals;

import food.Food;

public abstract class Carnivorous extends Animal {
    @Override
    public int eat(Food food) {
        return 0;
    }


}
