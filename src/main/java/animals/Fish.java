package animals;

import food.Food;
import food.Grass;

public class Fish extends Herbivore implements Swim{

    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Рыба ест");
            this.satiety += ((Grass) food).getEnergy();
        } else System.out.println("Еда не вкусная");
    }

    @Override
    public void swim() {

    }


}
