package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;
import model.Size;

public class Duck extends Herbivore implements Fly,Swim,Voice,Run {

    private int satiety;


    @Override
    public String getName() {
        return name;
    }

    public Duck(String name) {
        super(name);
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
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
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass){
            System.out.println("Утка ест");
        this.satiety += ((Grass) food).getEnergy();
        } else throw new WrongFoodException();
    }
}
