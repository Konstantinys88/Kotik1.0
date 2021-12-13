package animals;

import food.Food;

public abstract class Animal {

    int satiety;

    public abstract void eat(Food food);

    public abstract int getSatiety();


}
