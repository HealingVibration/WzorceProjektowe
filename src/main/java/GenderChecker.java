
public class GenderChecker {
    public static boolean isMale(PersonDwa person) {
        String name = person.getName();
        boolean isMale = true;
        if (name.endsWith("a")) {
            isMale = false;
        }
        return isMale;
    }
}