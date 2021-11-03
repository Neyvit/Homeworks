package pro.sky.java.course1.final_work;

public class Employee {
    private final String nameSurnameMiddleName;
    private int department;
    private int salary;
    private final int id;
    private static int counterId;


    public Employee(String nameSurnameMiddleName, int department, int salary) {
        this.nameSurnameMiddleName = nameSurnameMiddleName;
        this.department = department;
        this.salary = salary;
        this.id = ++counterId;
    }


    public int getDepartments() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getNameSurnameMiddleName() {
        return nameSurnameMiddleName;
    }

    public void setDepartments(int departments) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Full name: " + nameSurnameMiddleName +
                ", department: " + department +
                ", salary: " + salary +
                ", id: " + id;
    }
}