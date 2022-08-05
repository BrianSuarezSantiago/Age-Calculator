package agecalculator;

import java.util.Date;
/**
 * Class representing a person. The class has the necessary
 * public methods to obtain all the information needed to
 * work with a person instance. The class makes use of the
 * deprecated Java Date library.
 *
 * The class Date represents a specific instant in time,
 * with millisecond precision.
 *
 * @author Brian Suárez Santiago
 * @version 1.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Date.html">Class Date</a>
 */
public class Person {
    private final String name;
    private final Date birthdate;

    /**
     * Constructor initializing the attributes of a person.
     *
     * @param name Name of the person.
     * @param birthdate Date of birth of the person.
     */
    public Person(String name, Date birthdate) {
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
    public Date getBirthdate() {
        return this.birthdate;
    }

    /**
     * Returns the age of a person through the
     * difference in milliseconds between the
     * current date and the person's date of
     * birth.
     *
     * @return Age of the person.
     */
    public int getAge() {
        return (int) ((new Date().getTime() - this.birthdate.getTime())/31536000000L);
    }
}