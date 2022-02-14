public class GradStudent extends Student{

    String advisorName;

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String toString(){
        return "Name: " + getName() + "\nID Number: " + getIDNumber() + "\nAdvisor Name: " + advisorName;
    }

}
