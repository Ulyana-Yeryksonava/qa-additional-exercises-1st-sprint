package classes_and_objects;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Rob");
        person.setSurname("Bowden");
        person.setAge(27);
        person.setPhone("+33975178840");

        person.printAllInformation();
        person.printName();
        System.out.println(person.isAdult());
    }
}
