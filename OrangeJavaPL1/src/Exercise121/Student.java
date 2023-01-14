package Exercise121;

public class Student {
    private String firstName;

    private String lastName;

    private double avgGrade;

    private boolean isActive;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        avgGrade = 0.0;
        isActive = true;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
