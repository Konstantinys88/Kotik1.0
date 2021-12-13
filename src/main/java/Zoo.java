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


        Swim[]array = Zoo.createPond();

        for (Swim e : array){
            e.swim();
        }

        worker.getVoice(dog);

    }

     static Swim[] createPond(){
        Swim[]swim = new Swim[5];
        swim[0] = new Cow();
        swim[1] = new Crocodile();
        swim[2] = new Dog();
        swim[3] = new Duck();
        swim[4] = new Fish();
        return swim;
    }
}
