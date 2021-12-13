package animals;

import food.Food;
import food.Meat;

public class Crocodile extends Carnivorous implements Run,Swim,Voice {

    private int satiety;

    public int getSatiety() {
        return satiety;
    }


    @Override
    public void run() {
        System.out.println("run");

    }

    @Override
    public void swim() {
        System.out.println("swim");

    }

    @Override
    public String getVoice() {
        return "Rrrrr";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Крокодил ест");
            this.satiety += ((Meat) food).getEnergy();
        } else System.out.println("Еда не вкусная");
    }


}
