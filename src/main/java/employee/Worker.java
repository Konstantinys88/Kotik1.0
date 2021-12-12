package employee;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        animal.eat(food);

    }

    public void getVoice(Animal animal){
        if (animal instanceof Voice){
            System.out.println(((Voice) animal).getVoice());
        }else System.out.println("Не говорит");

    }

}
