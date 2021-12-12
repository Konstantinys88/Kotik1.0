package animals;

import food.Food;
import food.Grass;

public class Cow extends Herbivore implements Run,Swim,Voice{

    private String satiety;

    public String getSatiety() {
        return satiety;
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
        if (food instanceof Grass){
            this.satiety += ((Grass) food).getEnergy();
        } else System.out.println("Еда не вкусная");
    }


}
