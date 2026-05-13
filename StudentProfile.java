/**
 * StudentProfile — represents a student in AP Computer Science A.
 * Used to practice GitHub collaboration: everyone adds themselves!
 *
 * @author  Your Name Here
 * @version 1.0
 */
public class StudentProfile {

    // ─── Instance Variables (fields) ───────────────────────────────
    private String firstName;   // student's first name
    private String lastName;    // student's last name
    private int    gradeLevel;  // 9, 10, 11, or 12
    private String favLanguage; // favourite programming language so far
    private String funFact;     // one interesting fact about you

    // ─── Constructor ───────────────────────────────────────────────
    /**
     * Creates a new StudentProfile.
     *
     * @param firstName   student's first name
     * @param lastName    student's last name
     * @param gradeLevel  grade (9-12)
     * @param favLanguage favourite programming language
     * @param funFact     one interesting fun fact
     */
    public StudentProfile(String firstName, String lastName,
                          int gradeLevel, String favLanguage,
                          String funFact) {
        this.firstName   = firstName;
        this.lastName    = lastName;
        this.gradeLevel  = gradeLevel;
        this.favLanguage = favLanguage;
        this.funFact     = funFact;
    }

    // ─── Getters ────────────────────────────────────────────────────
    public String getFirstName()   { return firstName; }
    public String getLastName()    { return lastName; }
    public int    getGradeLevel()  { return gradeLevel; }
    public String getFavLanguage() { return favLanguage; }
    public String getFunFact()     { return funFact; }

    // ─── Setters ────────────────────────────────────────────────────
    public void setFavLanguage(String newLang) {
        this.favLanguage = newLang;
    }

    public void setFunFact(String newFact) {
        this.funFact = newFact;
    }

    // ─── Behaviour ──────────────────────────────────────────────────
    /**
     * Returns a nicely formatted introduction card.
     * @return multi-line String with all student info
     */
    public String introduce() {
        return "=================================\n" +
               "  Name      : " + firstName + " " + lastName + "\n" +
               "  Grade     : " + gradeLevel + "\n" +
               "  Fav Lang  : " + favLanguage + "\n" +
               "  Fun Fact  : " + funFact + "\n" +
               "=================================";
    }

    /**
     * Checks if two students are in the same grade.
     * @param other another StudentProfile to compare
     * @return true if same grade level
     */
    public boolean sameGrade(StudentProfile other) {
        return this.gradeLevel == other.gradeLevel;
    }

    /**
     * Standard toString — used by BlueJ's object inspector.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " (Grade " + gradeLevel + ")";
    }
}
