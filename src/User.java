/**
 * Created by iliubetska on 22.08.2016.
 */
public class User {
    public String gender;
    public String nationality;
    public int age;
    public String name;

    public User (String gender, String nationality, int age, String name) {
        System.out.println("Users are created: " + "gender is " + gender +", " + "nationality is " + nationality + ", "+ "age is " +age + ", " + "name is " + name);
        System.out.println("gender is " + gender);
        System.out.println("nationality is " + nationality);
        System.out.println("age is " + age);
        System.out.println("name is " + name);
    }
}
