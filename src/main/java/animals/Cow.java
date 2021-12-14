package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;
import model.Size;

public class Cow extends Herbivore implements Run,Swim,Voice{

    private int satiety;

    private String name;

    @Override
    public String getName() {
        return name;
    }


    public Cow(String name) {
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
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass){
            System.out.println("Корова ест");
            this.satiety += ((Grass) food).getEnergy();
        } else throw new WrongFoodException();
    }


}
