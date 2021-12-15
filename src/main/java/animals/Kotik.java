package animals;


import food.Food;
import food.Meat;
import food.WrongFoodException;
import model.Size;


public class Kotik extends Carnivorous implements Run, Voice {
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    String food;

    private static int count;

    private final static int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        super(name);
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;

    }

    public Kotik(String name) {
        super(name);
        count++;
    }

    boolean play() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    boolean sleep() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    boolean wash() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    boolean walk() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    boolean hunt() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }

    }

    public String[] liveAnotherDay() {
        String[] anotherDay = new String[24];
        for (int i = 0; i < anotherDay.length; i++) {
            switch (getRandomNumber()){
                case 1: if (play()){
                    anotherDay[i] = i + " - Играет";
                }
                else {
                    eat(getRandomNumber());
                    anotherDay[i] = i + " - Ест";
                }
                    break;

                case 2: if (sleep()){
                    anotherDay[i] = i + " - Спит";
                }
                else  {
                    eat(getRandomNumber());
                    anotherDay[i] = i + " - Ест";
                }
                    break;

                case 3: if (wash()){
                    anotherDay[i] = i + " - Умывается";
                }
                else  {
                    eat(getRandomNumber());
                    anotherDay[i] = i + " - Ест";
                }
                    break;

                case 4: if (walk()){
                    anotherDay[i] = i + " - Гуляет";
                }
                else  {
                    eat(getRandomNumber());
                    anotherDay[i] = i + " - Ест";
                }
                    break;

                case 5: if (hunt()){
                    anotherDay[i] = i + " - Охотится";
                }
                else  {
                    eat(getRandomNumber());
                    anotherDay[i] = i + " - Ест";
                }
                    break;

            }

        }
        return anotherDay;
    }

    public void eat(int satiety) {
        this.satiety += satiety;
    }

    public  void eat(int satiety, String food) {
        this.satiety += satiety;
        this.food = food;

    }

    public void eat() {
        eat(getRandomNumber(),"мясо");
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * METHODS) + 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public void run() {

    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat){
            System.out.println("Кот ест");
            this.satiety += ((Meat) food).getEnergy();
        } else throw new WrongFoodException();
    }
}
