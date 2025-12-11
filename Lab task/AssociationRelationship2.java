

// -------------------- POSITION --------------------
class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return title + " (Salary: $" + salary + ")";
    }
}

// -------------------- EMPLOYEE --------------------
class Employee {
    private String name;
    private Position position; // Employee HAS a Position

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void showEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
    }
}

// -------------------- COMPANY --------------------
class Company {
    private String companyName;
    private Employee[] employees; // fixed-size array
    private int count = 0;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[numberOfEmployees];
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
        } else {
            System.out.println("Cannot add more employees to " + companyName);
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees:");
        for (int i = 0; i < count; i++) {
            employees[i].showEmployeeInfo();
            System.out.println();
        }
    }
}

// -------------------- MAIN --------------------
public class AssociationRelationship2 {
    public static void main(String[] args) {

        // ----------- Relationship: Company has many Employees ----------
        Company company = new Company("Tech Solutions Ltd.", 3);

        Position p1 = new Position("Software Engineer", 60000);
        Position p2 = new Position("Data Analyst", 50000);
        Position p3 = new Position("Project Manager", 75000);

        Employee e1 = new Employee("Alice", p1);
        Employee e2 = new Employee("Bob", p2);
        Employee e3 = new Employee("Charlie", p3);

        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);

        company.showEmployees();
    }
}