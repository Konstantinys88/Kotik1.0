package animals;


import food.Food;


public class Kotik extends Carnivorous implements Run, Voice {
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    String food;

    private static int count;

    private final static int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;

    }

    public Kotik() {
        count++;
    }

    public boolean play() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else {
            return false;
        }
    }

    public boolean hunt() {
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
    public void eat(Food food) {

    }
}
