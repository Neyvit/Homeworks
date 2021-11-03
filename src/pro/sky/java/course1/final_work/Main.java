package pro.sky.java.course1.final_work;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        Employee[] staff = new Employee[10];


        staff[0] = new Employee("Gorbunov Daniil Dmitrievich", 1, 100000);
        staff[1] = new Employee("Kirichev Kirill Alekseevich", 1, 300000);
        staff[2] = new Employee("Radzhabov Tamerlan Ruslanovich", 5, 130000);
        staff[3] = new Employee("Shishkin Egor Ivanovich", 3, 110000);
        staff[4] = new Employee("Elanova Irina Stepanovna", 5, 135000);
        staff[5] = new Employee("Komlev Vitalii Stanislavovich", 4, 95000);
        staff[6] = new Employee("Strongman Maxim Sergeevich", 2, 500000);
        staff[7] = new Employee("Selieva Mariia Kirillovna", 4, 75000);
        staff[8] = new Employee("Starikov Dmitrii Petrovich", 2, 110000);
        staff[9] = new Employee("Simikchi Zarema Askarovna", 4, 150000);

        printStaff(staff);
        System.out.println("Сумма затрат на ЗП в месяц составит: " + calculateSalary(staff));
        System.out.println("Id сотрудника с минимальной ЗП: " + findMinimumSalary(staff));
        System.out.println("Id сотрудника с максимальной ЗП: " + findMaximumSalary(staff));
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary(staff));
        printEmployeesNames(staff);

    }

    public static void printStaff(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculateSalary(Employee[] employees) {
        int salary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salary += employee.getSalary();
            }
        }
        return salary;
    }

    public static int findMinimumSalary(Employee[] employees) {
        int minimumSalaryId = 0;
        int minimumSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minimumSalary) {
                    minimumSalary = employees[i].getSalary();
                    minimumSalaryId = i;
                }
            }
        }
        return minimumSalaryId;
    }

    public static int findMaximumSalary(Employee[] employees) {
        int maximumSalaryId = 0;
        int maximumSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maximumSalary) {
                    maximumSalary = employees[i].getSalary();
                    maximumSalaryId = i;
                }
            }
        }
        return maximumSalaryId;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        return calculateSalary(employees) / employees.length;
    }

    public static void printEmployeesNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ФИО сотрудника: " + employee.getNameSurnameMiddleName());
            }
        }
    }
}