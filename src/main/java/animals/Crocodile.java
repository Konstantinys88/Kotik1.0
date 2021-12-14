package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Crocodile extends Carnivorous implements Run,Swim,Voice {

    private int satiety;

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Crocodile(String name) {
        super(name);
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
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
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat){
            System.out.println("Крокодил ест");
            this.satiety += ((Meat) food).getEnergy();
        } else throw new WrongFoodException();
    }


}
