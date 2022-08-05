package agecalculator;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Class that initializes an object of type Person
 * in order to represent a person and obtain the
 * person's age.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html">Class Calendar</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html">Class GregorianCalendar</a>
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Brian", new GregorianCalendar(2001, Calendar.AUGUST, 28));
        System.out.println(person.getName() + " has " + person.getAge() + " years old.");
    }
}