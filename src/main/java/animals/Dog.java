package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Dog extends Carnivorous implements Run,Swim,Voice{

    private String satiety;
    public String getSatiety() {
        return satiety;
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
        if (food instanceof Meat){
            this.satiety += ((Meat) food).getEnergy();
        } else System.out.println("Еда не вкусная");
    }


}
