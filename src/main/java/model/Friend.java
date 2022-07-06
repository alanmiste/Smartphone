package model;

public class Friend extends Contact{
    private String telNumber;

    public Friend() {
    }

    public Friend(String name,String telNumber) {
        super(name);
        this.telNumber = telNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return name+", Tel: "+telNumber;
    }
}
