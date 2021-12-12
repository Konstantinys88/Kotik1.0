import animals.*;
import employee.Worker;
import food.Food;
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

        Food grass = new Grass();
        Food meat = new Meat();

        worker.getVoice(dog);

        worker.feed(cow,meat);

        System.out.println(crocodile.getSatiety());
        worker.feed(crocodile,grass);
        System.out.println(crocodile.getSatiety());
        worker.feed(crocodile,meat);
        System.out.println(crocodile.getSatiety());

        worker.getVoice(fish);


    }

    static Animal[] createPond(){
        Animal[]animals = new Animal[6];
        for (int i = 0; i < animals.length; i++) {


        }
        return animals;
    }
}
