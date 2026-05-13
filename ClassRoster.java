import java.util.ArrayList;

/**
 * ClassRoster — stores all StudentProfile objects for our AP CSA class.
 * Demonstrates ArrayList, iteration, and searching.
 *
 * @author  Your Name Here
 * @version 1.0
 */
public class ClassRoster {

    private ArrayList<StudentProfile> roster;
    private String className;

    /** Creates an empty roster for the given class name. */
    public ClassRoster(String className) {
        this.className = className;
        this.roster    = new ArrayList<>();
    }

    /** Adds a student to the roster. */
    public void addStudent(StudentProfile student) {
        roster.add(student);
        System.out.println("Added: " + student);
    }

    /** Prints every student's introduction card. */
    public void printAll() {
        System.out.println("\n=== " + className + " Roster ===");
        for (StudentProfile s : roster) {
            System.out.println(s.introduce());
            System.out.println();
        }
    }

    /** Returns how many students are in the roster. */
    public int size() {
        return roster.size();
    }

    /**
     * Finds a student by last name (case-insensitive).
     * @param lastName last name to search for
     * @return the StudentProfile, or null if not found
     */
    public StudentProfile findByLastName(String lastName) {
        for (StudentProfile s : roster) {
            if (s.getLastName().equalsIgnoreCase(lastName)) {
                return s;
            }
        }
        return null;  // not found
    }

    /**
     * Returns everyone in a specific grade.
     * @param grade grade level to filter by
     * @return ArrayList of matching students
     */
    public ArrayList<StudentProfile> getByGrade(int grade) {
        ArrayList<StudentProfile> result = new ArrayList<>();
        for (StudentProfile s : roster) {
            if (s.getGradeLevel() == grade) {
                result.add(s);
            }
        }
        return result;
    }
}
