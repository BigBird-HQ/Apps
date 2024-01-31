package phonebookApp;

public class PhoneBook {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public PhoneBook(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBook() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return String.format("""
                First Name: %s
                Last Name: %s
                Phone Number: %s
                """, firstName, lastName, phoneNumber);
    }
    public Object searchPhoneNumber(String firstName) {
        return String.format("%-5s%-5s\n%s",getFirstName(),getLastName() ,getPhoneNumber());
    }

    public void addPhoneNumber(String firstName, String lastName, String phoneNumber) {
    }
}
