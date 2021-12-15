package employee;

import animals.Animal;
import animals.Voice;
import food.Food;
import food.WrongFoodException;

public class Worker {

    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

    }


         public void getVoice(Voice a){
            System.out.println(a.getVoice());
    }



}
