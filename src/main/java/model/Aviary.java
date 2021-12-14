package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<Animals extends Animal> {
    HashMap<String, Animals> animalsHashMap = new HashMap<>();

    Size size;

    public Aviary(Size size) {
        this.size = size;
    }

    public void addAnimal(String name, Animals animals) {
        if (animals.getSize() != this.size) {
            throw new WrongSizeException();
        } else {
            animalsHashMap.put(name, animals);
        }

    }

    public Animals getAnimal(String name) {
        return animalsHashMap.get(name);
    }

    public boolean removeAnimal(String name) {
        if (animalsHashMap.containsKey(name)) {
            animalsHashMap.remove(name);
            return true;
        } else return false;

    }


}
