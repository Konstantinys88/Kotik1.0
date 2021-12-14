package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;
import model.Size;

public class Fish extends Herbivore implements Swim{

    private int satiety;


    @Override
    public String getName() {
        return name;
    }

    public Fish(String name) {
        super(name);
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass){
            System.out.println("Рыба ест");
            this.satiety += ((Grass) food).getEnergy();
        } else throw new WrongFoodException();
    }

    @Override
    public void swim() {
        System.out.println("swim");

    }


}
