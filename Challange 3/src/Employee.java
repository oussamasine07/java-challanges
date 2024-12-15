public class Employee {
    public String name;
    public String jobTitle;
    private double hourlyPayment;
    private double salary;

    Employee (String name, String jobTitle, double hourlyPayment) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.hourlyPayment = hourlyPayment;
    }

    public void updateHourlyPayement ( double hourlyPayment ) {
        this.hourlyPayment = hourlyPayment;
    }

    public double calculateSalery ( int numberOfHours ) {
        return this.hourlyPayment * numberOfHours;
    }

}
