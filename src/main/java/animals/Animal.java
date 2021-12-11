package animals;

import food.Food;

public abstract class Animal {

    int Satiety;

    public int getSatiety() {
        return Satiety;
    }


    public abstract int eat(Food food);

    public abstract String getVoice();


}
