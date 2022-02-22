public class Runner2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        //a cat is an animal, can make a cat an animal reference
        Animal a1 = new Cat();
        //the cat can only access the animal parts
        Cat c1 = (Cat)(a1);
        //can cast in the hierarchy
    }
}
