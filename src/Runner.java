public class Runner {
    public static void main(String[] args) {
        Student person = new Student();

        System.out.println(person);
        //can access name and id number
        //Student cannot access advisor name
        GradStudent g = new GradStudent();
        g.setName("Sarah");
        g.setIDNumber(623112);
        g.setAdvisorName("hi");
        System.out.println(g);

    }
}
