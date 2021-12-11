package animals;

import food.Food;

public class Duck extends Herbivore implements Fly,Swim,Voice,Run {

    private String Satiety;

    public String getSatiety() {
        return Satiety;
    }

    public void setSatiety(String satiety) {
        Satiety = satiety;
    }


    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String getVoice() {
        return "Kra";
    }

    @Override
    public void eat(Food food) {

    }
}
