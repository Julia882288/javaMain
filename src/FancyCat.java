/**
 * Created by iliubetska on 23.08.2016.
 */
public class FancyCat {
    public  String feature;
    public  int icons_id;
    public  int numberOfIcons;
    public  String functional;
    public  boolean dependsOnBet;

    public FancyCat (String feature, int icons_id, int numberOfIcons, String functional, boolean dependsOnBet) {
        System.out.println("The main features in Fancy Cat are: " + "feature is " + feature + ", " + "icon_id is " + icons_id + ", " + "the numberOfIcons is " + numberOfIcons + "," + "the main functional is " + functional + "," + "the payOut fedependsOnBet " + dependsOnBet + ".");
    }
}
