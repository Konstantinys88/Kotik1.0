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
        worker.getVoice(fish);

        worker.feed(cow,meat);
        System.out.println(crocodile.getSatiety());
        worker.feed(crocodile,meat);
        System.out.println(crocodile.getSatiety());
        worker.feed(crocodile,meat);
        System.out.println(crocodile.getSatiety());






    }

    static Swim[] createPond(){
        Animal[]animals = new Animal[6];
        animals[0] = new Cow();
        animals[1] = new Crocodile();
        animals[2] = new Dog();
        animals[3] = new Duck();
        animals[4] = new Fish();
        animals[5] = new Kotik();
        Animal[] swims = new Animal[4];
        for (int i = 0; i < animals.length; i++) {


        }
        return (Swim[]) swims;
    }
}
