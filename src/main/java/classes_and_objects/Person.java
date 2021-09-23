package classes_and_objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String phone;  // We store number in String type in case it starts with 0


    // Getters:
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    // Setters:
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Class methods:
    public void printAllInformation() {
        System.out.printf(
                "%s %s %d %s\n",
                this.name, this.surname, this.age, this.phone
        );
    }

    public void printName() {
        System.out.printf("%s %s\n", this.name, this.surname);
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
