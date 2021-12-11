package animals;

import food.Food;

public class Cow extends Herbivore implements Run,Swim,Voice{

    private int Satiety;

    public int getSatiety() {
        return Satiety;
    }


    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String getVoice() {
        return "Myy";
    }


}
