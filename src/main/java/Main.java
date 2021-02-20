import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Person person = new Person("Agata", "Koniczynka", 25);
        Person person2 = new Person("Wojciech", "Parzybroda", 27);
        Person person3 = new Person("Małgorzata", "Butek", 26);

        List<Person> list = Arrays.asList(person, person2, person3);

        for (Person element : list) {
            if (element.getName().endsWith("a")) {
                System.out.println(element.getName() + " " + element.getSurname() + " jest Kobietą");
            } else {
                System.out.println(element.getName() + " " + element.getSurname() + " jest Mężczyzną");
            }

        }


    }
}
