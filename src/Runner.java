public class Runner {
    public static void main(String[] args) {
//        Student person = new Student();
//
//        System.out.println(person);
//        //can access name and id number
//        //Student cannot access advisor name
//        GradStudent g = new GradStudent();
//        g.setName("Sarah");
//        g.setIDNumber(623112);
//        g.setAdvisorName("hi");
//        System.out.println(g);

        //only creates the person
        Person person = new Person();
        //creates the person and the teacher and then goes to toString
        //has to go through the constructor and then to the toString method
        Teacher teacher = new Teacher();
        System.out.println(teacher.getName());
        System.out.println(teacher.getDegreeLevel());
    }
}
