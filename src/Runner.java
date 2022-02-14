public class Runner {
    public static void main(String[] args) {
        Student person = new Student();

        System.out.println(person);
        //can access name and id number
        //Student cannot access advisor name
        GradStudent Sarah = new GradStudent();
        System.out.println(Sarah.IDNumber);
    }
}
