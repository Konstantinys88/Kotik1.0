package animals;

import food.Food;

public class Duck extends Herbivore implements Fly,Swim,Voice {

    private int Satiety;

    public int getSatiety() {
        return Satiety;
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String getVoice() {
        return "Kra";
    }


}
