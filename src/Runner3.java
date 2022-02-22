public class Runner3 {
    public static void main(String[] args) {
        Animal[] array = {new Cat(), new Dog(), new Dog()};

        if(array[0] instanceof Cat){
            Cat current = (Cat) array[0];
            current.method1();
        }else if(array[0] instanceof Dog){
            Dog current = (Dog) array[0];
            int x = current.d;
        }else{
            //deal as animal
        }
    }
}
