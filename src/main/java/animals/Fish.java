package animals;

import food.Food;

public class Fish extends Herbivore implements Swim{

    private int Satiety;

    public int getSatiety() {
        return Satiety;
    }

    @Override
    public void swim() {

    }


}