import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Person person = new Person("Agata", "Koniczynka", 25);
        Person person2 = new Person("Wojciech", "Parzybroda", 27);
        Person person3 = new Person("Małgorzata", "Butek", 26);

        List<Person> list = Arrays.asList(person, person2, person3);

        NewPerson.checkPerson(list);


    }
}
