package agecalculator;

import java.util.Calendar;
/**
 * Class representing a person. The class has the necessary
 * public methods to obtain all the information needed to
 * work with a person instance. The class makes use of the
 * Java Calendar and GregorianCalendar utilities.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html">Class Calendar</a>
 */
public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    /**
     * Constructor initializing the attributes of a person.
     *
     * @param name Name of the person.
     * @param birthdate Date of birth of the person.
     */
    public Person(String name, Calendar birthdate) {
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
    public Calendar getBirthdate() {
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
        Calendar currentDate = Calendar.getInstance();
        return (int) (milliSecondsToYear(currentDate.getTimeInMillis() - this.birthdate.getTimeInMillis()));
    }

    /**
     * Converts milliseconds passed as a
     * parameter into years.
     *
     * @param millis Milliseconds to convert to years.
     * @return Years equivalent to the milliseconds passed as an argument.
     */
    private long milliSecondsToYear(long millis) {
        return millis/MILLISECONDS_PER_YEAR;
    }
}