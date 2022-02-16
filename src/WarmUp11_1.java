/*
 * Create an Insect class. The objects of the class have two fields.
 * A String instance variable called name and a constant instance variable
 * named numberOfLegs that has a value of 6. Create a way to set and
 * get the private field. Also create a toString method that prints
 * the name of the Insect.
 *
 * Create a Fly class that inherits from the Insect class. Add a new
 * boolean instance variable named hasWings. Allow the user to set
 * or get the private instance variable and create a toString that
 * prints all properties.
 */
public class WarmUp11_1 {
    public static void main(String args[])
    {
        Fly one = new Fly();
        one.setName("Bill");
        one.setHasWings(true);
        System.out.println(one);
    }
}
