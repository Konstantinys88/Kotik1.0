package animals;

import food.Food;

public class Fish extends Herbivore implements Swim{

    private String Satiety;

    public String getSatiety() {
        return Satiety;
    }



    @Override
    public String getVoice() {
        return null;
    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public void swim() {

    }


}
