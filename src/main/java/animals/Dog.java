package animals;

import food.Food;
import food.Meat;

public class Dog extends Carnivorous implements Run,Swim,Voice{

    private String Satiety;
    public String getSatiety() {
        return Satiety;
    }

    public void setSatiety(String satiety) {
        Satiety = satiety;
    }


    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String getVoice() {
        return "Gav";
    }

    @Override
    public void eat(Food food) {

    }


}
