/**
 * Created by iliubetska on 22.08.2016.
 */
public class Main {

    private int anInt;
    private long aLong;
    private boolean aBoolean;
    private static float aFloat;
    private char aChar;
    private double aDouble;
    private byte aByte;
    private static short aShort;

    public static void main(String[] args) {
        System.out.println(aFloat);
        System.out.println(aShort);
        new User("male","Ukr",50,"John");
        new User("female","Fr", 82, "Elen");
        new User("male","USA", 48, "Tom");
        new User("male","New Zealand", 55, "Guy");

        new Machine("Honda", 2016, 210, "white", 2.9);
        new Machine("BMW", 2017, 240, "black", 3.9);
        new Machine("Audi", 2010, 250, "blue", 2.9);
        new Machine("Ford", 2018, 260, "dark-blue", 3.0);

        new Lobby("Fancy Cat", 370, "Collect all", "Tournomania", "Oz");
        new Lobby("Bucky Beaver", 369, "Piggy", "Gifts", "Farm Fortune");
        new Lobby("Chilly Loco", 211, "Experience", "MegaBonus", "Pirates");
        new Lobby("Money", 222, "Balance", "slotoCards", "Nights");

        new FancyCat("Scatter Pays", 13, 5, "gives coins", true);
        new FancyCat("Fluffy Bonus", 1, 3, "gives free spins", true);
        new FancyCat("Paw Bonus", 12, 3, "gives coins", true);
        new FancyCat("Jackpot", 0, 0, "gives coins", true);

        new Phoenix("Scatter", 1, 88, "gives free spins", true);
        new Phoenix("Wild", 2, 0, "gives coins", false);
        new Phoenix("Progressive Jackpot", 0, 3, "gives coins", true);
        new Phoenix("Jackpot Pick Game", 12, 5, "gives coins", true);
        new Phoenix("Scatter Anticipator", 1, 5, "gives free spins", true);
    }

    public static int doSmth(int q, int b, char c) {
        return q+b;
    }
}
