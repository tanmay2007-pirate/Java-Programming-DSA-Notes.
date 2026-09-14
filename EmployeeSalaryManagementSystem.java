interface BonusEligibility {
    boolean isEligible(double salary, double performanceScore);
}

class Employee {
    private String name;
    private int empId;
    private double basicSalary;

    public Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        return basicSalary + hra + da;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeSalaryManagementSystem {
    public static void main(String[] args) {
        BonusEligibility bonusCheck = (salary, performanceScore) -> salary < 50000 && performanceScore >= 7.0;

        Employee emp1 = new Employee("Rahul Sharma", 101, 35000);
        Employee emp2 = new Employee("Priya Verma", 102, 60000);

        double emp1PerformanceScore = 8.5;
        double emp2PerformanceScore = 6.0;

        System.out.println("---- Employee 1 Details ----");
        emp1.displayDetails();
        boolean emp1Eligible = bonusCheck.isEligible(emp1.calculateGrossSalary(), emp1PerformanceScore);
        System.out.println("Bonus Eligible: " + emp1Eligible);

        System.out.println();

        System.out.println("---- Employee 2 Details ----");
        emp2.displayDetails();
        boolean emp2Eligible = bonusCheck.isEligible( emp2.calculateGrossSalary(), emp2PerformanceScore);
        System.out.println("Bonus Eligible: " + emp2Eligible);
    }
}