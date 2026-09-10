class Employee {
    double basicSalary;

    Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class Driver extends Employee {
    double overtime;

    Driver(double basicSalary, double overtime) {
        super(basicSalary);
        this.overtime = overtime;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 3000;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Driver(15000, 3000);
        System.out.println("Total Salary: Rs. " + emp.calculateSalary());
    }
}
