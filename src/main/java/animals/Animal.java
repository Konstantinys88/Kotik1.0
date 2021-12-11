package animals;

import food.Food;

public abstract class Animal {

    private int Satiety;

    public int getSatiety() {
        return Satiety;
    }

    public void setSatiety(int satiety) {
        Satiety = satiety;
    }

    public abstract int eat(Food food);
}
