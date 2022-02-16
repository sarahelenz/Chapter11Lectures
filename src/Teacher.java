public class Teacher extends Person{
    private String degreeLevel;

    public Teacher(){
        this("Sarah", "B");
        System.out.println("Is the teacher constructor");
    }
    public Teacher(String name, String degreeLevel){
        super(name);
        this.degreeLevel = degreeLevel;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public void setName(String name){
        super.setName(name);
    }
}
