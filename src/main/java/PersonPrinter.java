
public class PersonPrinter {
    public static void print(PersonDwa person, boolean isMale) {
        String male = "jest mężczyzną.";
        String female = "jest kobietą.";
        if (isMale) {
            System.out.println(String.format("%s %s %s", person.getName(), person.getSurname(), male));
        } else {
            System.out.println(String.format("%s %s %s", person.getName(), person.getSurname(), female));
        }
    }


    public static void printAge(PersonDwa person){
        System.out.println(String.format("%s %s za 10 lat będzie miał %d",
                person.getName(), person.getSurname(), person.getAgePlus() ));
    }
}