package customer;

public class customerData {

    private String firstName;
    private String lastName;
    private int age;
    private address address = new address();
    private phoneNumbers phoneNumber= new phoneNumbers();

    public customerData() {
    }

    public customerData(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public phoneNumbers getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(phoneNumbers phoneNumber) {
        this.phoneNumber =phoneNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "customerData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", pNumbers=" + phoneNumber +
                '}';
    }
}
