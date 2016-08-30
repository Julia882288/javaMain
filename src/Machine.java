/**
 * Created by iliubetska on 22.08.2016.
 */
public class Machine {
    public String name;
    public int year;
    public float averageSpeed;
    public String color;
    public double engineVolume;

    public Machine(String name, int year, float averageSpeed, String color, double engineVolume) {
        System.out.println("The MachinesData are: " + "name is " + name + ", " + "year is " + year + ", " + "averageSpeed is "
                + averageSpeed + "," + "color is " + color + ", " + "engineVolume"  + engineVolume);

    }

}
