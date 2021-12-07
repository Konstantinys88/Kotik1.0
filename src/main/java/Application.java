import animals.Kotik;


public class Application {
    public static void main(String[] args) {


        Kotik cat1 = new Kotik("Vasia","Gav",10,8);
        Kotik cat2 = new Kotik();

        System.out.println(cat1.getVoice().equals(cat2.getVoice()));
        System.out.println(Kotik.getCount());
        System.out.println();

        String[]arr = cat1.liveAnotherDay(cat1);
        for (String e:arr) {
            System.out.println(e);

        }

























    }
}
