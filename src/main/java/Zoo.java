import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {


        Kotik kotik = new Kotik();
        Dog dog = new Dog();
        Crocodile crocodile = new Crocodile();

        Fish fish = new Fish();
        Duck duck = new Duck();
        Cow cow = new Cow();

        Grass grass = new Grass();
        Meat meat = new Meat();

        Worker worker =new Worker();

    }

    static Animal[] createPond(){
        Animal[] animals = new Animal[6];
        for (int i = 0; i < animals.length; i++) {


        }
        return animals;
    }
}
