import model.Contact;
import model.Friend;
import model.Smartphone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Smartphone nokia = new Smartphone("3310","Nokia",new Contact[]{new Friend("Elon Musk","123456")});
        System.out.println(nokia.toString());
    }
}
