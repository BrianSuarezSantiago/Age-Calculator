package agecalculator;

import java.time.LocalDate;
/**
 * Class that initializes an object of type Person
 * in order to represent a person and obtain the
 * person's age.
 *
 * @author Brian Suárez Santiago
 * @version 3.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html">Class LocalDate</a>
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Brian", LocalDate.of(2001, 8, 28));
        System.out.println(person.getName() + " has " + person.getAge() + " years old.");
    }
}