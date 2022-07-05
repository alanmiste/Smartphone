package model;

public abstract class Contact {
    String name;

    public Contact() {
    }

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
