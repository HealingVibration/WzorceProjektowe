import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NewPerson {
    public static void  checkPerson(List<Person> list) {

        for (Person element : list) {
            if (element.getName().endsWith("a")) {
               System.out.println(element.getName() + " " + element.getSurname() + " jest Kobietą");

            } else {
                System.out.println(element.getName() + " " + element.getSurname() + " jest Mężczyzną");
            }
        }
    }


}
