import java.awt.*;

public class Runner4 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.method4();
        Cat c = new Cat();
        c.method4();

        Animal a1 = new Cat();
        a1.method4();

        Animal a2 = new Dog();
        a2.method4();
    }
}
