package Models;

public class User {


   private String firstName;
    private String lastName;
    private String clearance;

    public User(String firstName, String lastName, String clearance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clearance = clearance;
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

    public String getClearance() {
        return clearance;
    }

    public void setClearance(String clearance) {
        this.clearance = clearance;
    } 



}
