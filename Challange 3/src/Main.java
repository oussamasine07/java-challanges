//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("oussama", "developer", 200);

        employee.updateHourlyPayement(250);
        double salary = employee.calculateSalery(45);

        System.out.println("the employee " + employee.name + " is getting paid " + salary);

    }
}