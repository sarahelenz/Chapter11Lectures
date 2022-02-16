public class Person {

    private String name;

    public Person(){
        name = "Sarah";
        System.out.println("Is the person constructor");
    }
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
