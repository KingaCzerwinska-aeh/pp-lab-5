import company.beans.Person;
import company.exceptions.InvalidAgeException;
public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Karolina Ogórek", 40);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}