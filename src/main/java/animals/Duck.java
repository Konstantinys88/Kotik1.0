package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Fly,Swim,Voice,Run {

    private int satiety;


    public int getSatiety() {
        return satiety;
    }


    @Override
    public void fly() {
        System.out.println("Fly");

    }

    @Override
    public void run() {
        System.out.println("Run");

    }

    @Override
    public void swim() {
        System.out.println("swim");

    }

    @Override
    public String getVoice() {
        return "Kra";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
        this.satiety += ((Grass) food).getEnergy();
        } else System.out.println("Еда не вкусная");
    }
}
