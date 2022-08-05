package agecalculator;

import java.time.LocalDate;
import java.time.Period;
/**
 * Class representing a person. The class has the necessary
 * public methods to obtain all the information needed to
 * work with a person instance. The class makes use of the
 * Java LocalDate and Period utilities from Java 8.
 *
 * @author Brian Suárez Santiago
 * @version 3.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html">Class LocalDate</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/Period.html">Class Period</a>
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;

    /**
     * Constructor initializing the attributes of a person.
     *
     * @param name Name of the person.
     * @param birthdate Date of birth of the person.
     */
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    /**
     * Returns the name of the person.
     *
     * @return Name of the person.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the date of birth of the person.
     *
     * @return Date of birth of the person.
     */
    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    /**
     * Returns the age of a person through the
     * difference in milliseconds between the current date
     * and the person's date of birth.
     *
     * @return Age of the person.
     */
    public int getAge() {
        return (Period.between(this.birthdate, LocalDate.now()).getYears());
    }
}