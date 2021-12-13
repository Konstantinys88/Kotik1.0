package animals;

import food.Food;
import food.Grass;

public class Cow extends Herbivore implements Run,Swim,Voice{

    private int satiety;

    public int getSatiety() {
        return satiety;
    }


    @Override
    public void run() {
        System.out.println("Run");

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
        if (food instanceof Grass){
            System.out.println("Корова ест");
            this.satiety += ((Grass) food).getEnergy();
        } else System.out.println("Еда не вкусная");
    }


}
