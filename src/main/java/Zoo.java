import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {

        Cow cow = new Cow();
        Crocodile crocodile = new Crocodile();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();

        Worker worker = new Worker();

        Grass grass = new Grass();
        Meat meat = new Meat();


        worker.getVoice(cow);

    }

    static Swim[] createPond(){
       Swim[] swims = new Swim[6];
        for (int i = 0; i < swims.length; i++) {


        }
        return swims;
    }
}
