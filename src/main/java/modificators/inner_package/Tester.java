package modificators.inner_package;

public class Tester {
    private String name;
    protected String surname;
    int experienceInYears;  // default
    String englishLevel;  // default
    public int salary;

    Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Tester(int experienceInYears, int salary) {
        this("Rob", "Bowden");
        this.experienceInYears = experienceInYears;
        this.salary = salary;
    }


    public Tester(String englishLevel) {
        this(2, 150_000);
        this.englishLevel = englishLevel;
    }


    // Getters and setters:

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    protected int getExperienceInYears() {
        return experienceInYears;
    }

    protected void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    protected String getEnglishLevel() {
        return englishLevel;
    }

    protected void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    protected int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    // Class methods:
    private int doubleSalary() {
        return this.salary * 2;
    }

    protected int experienceInMonths() {
        return this.experienceInYears * 12;
    }

    protected void printFullName() {
        System.out.printf("%s %s\n", this.name, this.surname);
    }

    public void printAllInfo() {
        System.out.printf(
                "%s %s %d %s %d\n",
                this.name, this.surname, this.experienceInYears, this.englishLevel, this.salary
        );
    }
}
