package animals;


public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;

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

    public void eat(int satiety) {
        this.satiety = satiety;
        satiety++;
    }

    public void eat(int satiety, String food) {
        this.satiety = satiety;
    }

    public static void eat() {
        eat();
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * METHODS) + 1;
    }

    public String[] liveAnotherDay() {
        String[] anotherDay = new String[24];
        for (int i = 0; i < anotherDay.length; i++) {
            switch (getRandomNumber()){
                case 1: if (play() == true){
                    anotherDay[i] = i + " Играет";
                }
                else {
                    eat(2);
                    anotherDay[i] = i + " Ест";
                }
                    break;

                case 2: if (sleep() == true){
                    anotherDay[i] = i + " Спит";
                }
                else  {
                    eat(3);
                    anotherDay[i] = i + " Ест";
                }
                    break;

                case 3: if (wash() == true){
                    anotherDay[i] = i + " Умывается";
                }
                else  {
                    eat(2);
                    anotherDay[i] = i + " Ест";
                }
                    break;

                case 4: if (walk() == true){
                    anotherDay[i] = i + " Гуляет";
                }
                else  {
                    eat(1);
                    anotherDay[i] = i + " Ест";
                }
                    break;

                case 5: if (hunt() == true){
                    anotherDay[i] = i + " Охотится";
                }
                else  {
                    eat(0);
                    anotherDay[i] = i + " Ест";
                }
                    break;

            }

        }
        return anotherDay;
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


}
