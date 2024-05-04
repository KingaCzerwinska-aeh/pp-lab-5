import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[5];
        int b = 10;

        try {
            people[0] = new Person("Karolina Ogorek", 40);
            people[1] = new Person("Krystyna Pomidor", 60);
            people[2] = new Person("Klaudia Pietruszka", 50);
            people[3] = new Person("Kornelia Marchewka", 30);
            people[4] = new Person("Klara Burak", 20);

            for (Person person : people) {
                int sum = MathUtils.add(person.getAge(), b);
                String message = "Dla " + person.getName() + " suma jej wieku tj: " + person.getAge() + " lat" + " i " + b + " wynosi: " + sum;
                new EmailMessenger().sendMessage(message);
            }

        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}


