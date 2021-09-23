package modificators.outer_package;

import modificators.inner_package.Tester;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("Advanced");
        // tester.doubleSalary() - this method accessible only on class level
        // tester.experienceInMonths() - this method accessible only on class and package level
        // tester.printFullName() - this method accessible only on class and package level
        tester.printAllInfo();
    }
}
