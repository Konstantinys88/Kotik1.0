package model;
import animals.Animal;
import java.util.HashMap;

public class Aviary<Animals extends Animal> {
    private HashMap<String, Animals> aviaryMap = new HashMap<String, Animals>(){{
        put(null,null);
    }};

    private Size size;

   public Aviary(Size size) {
        this.size = size;
    }

    public void addAnimal(Animals animals) {
        if (animals.getSize() != size) {
            throw new WrongSizeException();
        } else {
            aviaryMap.put(animals.name, animals);
        }
    }

    public Animals getAnimal(String name) {
        return aviaryMap.get(name);
    }

    public boolean removeAnimal(String name) {
        if (aviaryMap.containsKey(name)) {
            aviaryMap.remove(name);
            System.out.println("Размер HashMap = " + aviaryMap.size());
            return true;
        } else {
            System.out.println("Размер HashMap = " + aviaryMap.size());
            return false;
        }
    }
}


