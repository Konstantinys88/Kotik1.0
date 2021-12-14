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

        try {
            worker.feed(cow, meat);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

        System.out.println(crocodile.getSatiety());

        try {
            worker.feed(crocodile, grass);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

        System.out.println(crocodile.getSatiety());

        try {
            worker.feed(crocodile, meat);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

        System.out.println(crocodile.getSatiety());

        Swim[] array = Zoo.createPond();

        for (Swim e : array) {
            e.swim();
        }

        worker.getVoice(dog);

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

    Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.LARGE);
    Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.MEDIUM);
    Aviary<Animal>animalAviary = new Aviary<>(Size.SMALL);

    static void fillCarnivorousAviary() {
        Carnivorous dog1 = new Dog("Tor");
        Carnivorous croc = new Crocodile("Xulk");
    }

    static void fillHerbivoreAviary(){

    }

    static Carnivorous getCarnivorous(String name){
        return null;
    }

    static Herbivore getHerbivore(String name){
        return null;
    }


}




