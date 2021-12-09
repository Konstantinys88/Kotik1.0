import animals.Kotik;


public class Application {

    public static boolean compareVoice(Kotik a, Kotik b ){
        return a.getVoice().equals(b.getVoice());
    }

    public static void main(String[] args) {

        Kotik cat1 = new Kotik("Vasia","Gav",0,8);
        Kotik cat2 = new Kotik();

        System.out.println(Application.compareVoice(cat1,cat2));
        System.out.println(Kotik.getCount());

        String[]arr = cat1.liveAnotherDay();
        for (String e:arr) {
            System.out.println(e);
        }
































    }
}
