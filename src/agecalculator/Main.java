package agecalculator;

import java.util.Date;
/**
 * Class that initializes an object of type Person
 * in order to represent a person and obtain the
 * person's age.
 *
 * @author Brian Suárez Santiago
 * @version 1.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Date.html">Class Date</a>
 * @deprecated As of JDK version 1.1 Date class is deprecated and replaced by Calendar class.
 */
public class Main {

    @Deprecated
    public static void main(String[] args) {
        Person person = new Person("Brian", new Date(101, 7, 28));
        System.out.println(person.getName() + " has " + person.getAge() + " years old.");
    }
}