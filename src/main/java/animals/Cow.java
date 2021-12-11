package animals;

import food.Food;

public class Cow extends Herbivore implements Run,Swim,Voice{

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
        System.out.println("плывет");

    }

    @Override
    public String getVoice() {
        return "Myyy";
    }

    @Override
    public void eat(Food food) {


    }


}
