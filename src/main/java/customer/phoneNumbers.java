package customer;

public class phoneNumbers {

    private String type;
    private String number;

    public phoneNumbers() {
    }

    public phoneNumbers(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "phoneNumbers{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
