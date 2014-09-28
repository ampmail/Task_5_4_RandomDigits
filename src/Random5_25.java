import java.util.Random;

public class Random5_25 {
    public static void main(String[] args) {
//        for (int i = 0; i < 15; i++)
            System.out.println((int)(Math.random()*21+5));

//        Random rand = new Random();
//        System.out.println(5 + rand.nextInt(21));

//        for (int i = 0; i < 15; i++)
//            System.out.println(getRand());
    }

    public static int a = 45;
    public static int c = 21;
    public static int m = 67;
    public static int seed = 2;

    public static int getRand() {
        seed = (a * seed + c) % m;
        return seed;
    }
}