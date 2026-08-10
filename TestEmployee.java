class Person {
    private String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    // Constructor
    Employee(String name, double annualSalary, int startYear,
             String nationalInsuranceNumber) {

        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Bhavani",
                600000.0,
                2024,
                "NI123456"
        );

        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Start Year: " + emp.getStartYear());
        System.out.println("National Insurance Number: "
                + emp.getNationalInsuranceNumber());

        // Updating details
        emp.setName("Akkapolu Bhavani");
        emp.setAnnualSalary(650000.0);
        emp.setStartYear(2025);
        emp.setNationalInsuranceNumber("NI987654");

        System.out.println();
        System.out.println("Updated Employee Details");
        System.out.println("------------------------");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Start Year: " + emp.getStartYear());
        System.out.println("National Insurance Number: "
                + emp.getNationalInsuranceNumber());
    }
}