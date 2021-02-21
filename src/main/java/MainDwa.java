public class MainDwa {
    public static void main(String[] args) {
        PersonDwa person = new PersonDwa(args[0], args[1], Integer.parseInt(args[2]));
        PersonPrinter.print(person, GenderChecker.isMale(person));
        PersonAge.ageAdd(person, 10);
        PersonPrinter.printAge(person);
    }
}

