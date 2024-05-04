import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Karolina Ogórek", 40);
            int a = 23;
            int b = 34;
            int sum = MathUtils.add(a, b);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
            System.out.println("Suma: " + sum);
            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Suma " + a + " i " + b + " wynosi: " + sum);
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}