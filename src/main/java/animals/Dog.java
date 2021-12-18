package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Dog extends Carnivorous implements Run,Swim,Voice{

    private int satiety;

    @Override
    public String getName() {
        return name;
    }

    public Dog(String name) {
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
    public void run() {
        System.out.println("run");

    }

    @Override
    public void swim() {
        System.out.println("swim");

    }

    @Override
    public String getVoice() {
        return "Gav";
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat){
            System.out.println("Собака ест");
            this.satiety += ((Meat) food).getEnergy();
        } else throw new WrongFoodException();
    }


}
