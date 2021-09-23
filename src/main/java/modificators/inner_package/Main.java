package modificators.inner_package;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("Advanced");
        // tester.doubleSalary() - this method accessible only on class level
        tester.experienceInMonths();
        tester.printFullName();
        tester.printAllInfo();
    }
}
