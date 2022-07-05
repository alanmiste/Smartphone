package model;

public class Friend extends Contact{
    String telNumber;

    public Friend() {
    }

    public Friend(String telNumber, String name) {
        super(name);
        this.telNumber = telNumber;
    }


    @Override
    public String toString() {
        return name+" "+telNumber;
    }
}
