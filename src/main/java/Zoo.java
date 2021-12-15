import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Aviary;
import model.Size;


public class Zoo {
    public static void main(String[] args) {

        Cow cow = new Cow("MuMy");
        Crocodile crocodile = new Crocodile("Croc");
        Dog dog = new Dog("Dora");
        Duck duck = new Duck("Skrydj");
        Fish fish = new Fish("Som");
        Kotik kotik = new Kotik("Mzy");

        Worker worker = new Worker();

        Food grass = new Grass();
        Food meat = new Meat();

        worker.getVoice(dog);
        worker.feed(cow, meat);
        System.out.println(crocodile.getSatiety());
        worker.feed(crocodile, grass);
        System.out.println(crocodile.getSatiety());
        worker.feed(crocodile, meat);

        System.out.println(crocodile.getSatiety());

        Swim[] array = Zoo.createPond();

        for (Swim e : array) {
            e.swim();
        }

        worker.getVoice(dog);

        fillHerbivoreAviary();
        fillCarnivorousAviary();

        getHerbivore("Cat");


        System.out.println(carnivorousAviary.getAnimal("Tor"));
        System.out.println(carnivorousAviary.removeAnimal("Tor"));
        System.out.println(carnivorousAviary.getAnimal("Tor"));
        System.out.println(carnivorousAviary.removeAnimal("NO"));
        System.out.println(carnivorousAviary.getAnimal("123"));
        herbivoreAviary.removeAnimal( "Cat");


    }

    static Swim[] createPond() {
        Swim[] swim = new Swim[5];
        swim[0] = new Cow("My");
        swim[1] = new Crocodile("Cro");
        swim[2] = new Dog("Scharik");
        swim[3] = new Duck("Kria");
        swim[4] = new Fish("Meg");
        return swim;
    }

    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.LARGE);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.MEDIUM);

    static void fillCarnivorousAviary() {
        Carnivorous croc = new Crocodile("Xulk");
        Carnivorous croc1 = new Crocodile("Tor");
        carnivorousAviary.addAnimal(croc);
        carnivorousAviary.addAnimal(croc1);

    }

    static void fillHerbivoreAviary() {
        Herbivore fish1 = new Fish("Cat");
        Herbivore fish2 = new Fish("Sofia");
        herbivoreAviary.addAnimal(fish1);
        herbivoreAviary.addAnimal(fish2);

    }

    static Carnivorous getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);
    }

    static Herbivore getHerbivore(String name) {
        return herbivoreAviary.getAnimal(name);
    }


}




