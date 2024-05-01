public class Employee {
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        if (socialSecurityNumber > 0) {
            this.socialSecurityNumber = socialSecurityNumber;
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("Employee Name: %s %s \nSocial Security Number: %d", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
