package pro.sky.java.course1.final_work;

public class Employee {
    private static int counterId;
    private final String name;
    private final String surname;
    private final String middleName;
    private final int id;
    private int department;
    private int salary;


    public Employee(String surname, String name, String middleName, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = ++counterId;
    }


    public int getDepartments() {
        return department;
    }

    public void setDepartments(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return getSurname() + " " + getName() + " " + getMiddleName();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", surname: " + surname + ", middleName: " + middleName +
                ", department: " + department +
                ", salary: " + salary +
                ", id: " + id;
    }
}