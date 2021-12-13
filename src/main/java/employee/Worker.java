package employee;

import animals.Animal;
import animals.Swim;
import animals.Voice;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
            animal.eat(food);
    }

     public void getVoice(Animal animal){
            System.out.println(((Voice) animal).getVoice());
    }

}
