package pro.sky.java.course1.final_work;

public class Main {
    private static final Employee[] staff = new Employee[10];

    public static void main(String[] args) {


        staff[0] = new Employee("Gorbunov", "Daniil", "Dmitrievich", 1, 100000);
        staff[1] = new Employee("Kirichev", "Kirill", "Alekseevich", 1, 300000);
        staff[2] = new Employee("Radzhabov", "Tamerlan", "Ruslanovich", 5,130000);
        staff[3] = new Employee("Shishkin", "Egor", "Ivanovich",3,110000);
        staff[4] = new Employee("Elanova", "Irina", "Stepanovna", 5,135000);
        staff[5] = new Employee("Komlev", "Vitalii", "Stanislavovich", 4,95000);
        staff[6] = new Employee("Strongman", "Maxim", "Sergeevich",2,500000);
        staff[7] = new Employee("Selieva", "Mariia", "Kirillovna",4,75000);
        staff[8] = new Employee("Starikov", "Dmitrii", "Petrovich",2,110000);
        staff[9] = new Employee("Simikchi", "Zarema", "Askarovna",4,150000);

        printStaff();
        System.out.println("Сумма затрат на ЗП в месяц составит: " + calculateTotalSalary());
        System.out.println("Id сотрудника с минимальной ЗП: " + findMinimumSalary());
        System.out.println("Id сотрудника с максимальной ЗП: " + findMaximumSalary());
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
        printEmployeesNames();

    }

    public static void printStaff() {
        for (Employee employee : staff) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculateTotalSalary() {
        int salary = 0;
        for (Employee employee : staff) {
            if (employee != null) {
                salary += employee.getSalary();
            }
        }
        return salary;
    }

    public static int findMinimumSalary() {
        int minimumSalaryId = 0;
        int minimumSalary = staff[0].getSalary();
        for (int i = 1; i < staff.length; i++) {
            if (staff[i] != null) {
                if (staff[i].getSalary() < minimumSalary) {
                    minimumSalary = staff[i].getSalary();
                    minimumSalaryId = i;
                }
            }
        }
        return minimumSalaryId;
    }

    public static int findMaximumSalary() {
        int maximumSalaryId = 0;
        int maximumSalary = staff[0].getSalary();
        for (int i = 1; i < staff.length; i++) {
            if (staff[i] != null) {
                if (staff[i].getSalary() > maximumSalary) {
                    maximumSalary = staff[i].getSalary();
                    maximumSalaryId = i;
                }
            }
        }
        return maximumSalaryId;
    }

    public static double calculateAverageSalary() {
        int employeesNumber = 0;
        for (Employee employee : staff) {
            if (employee != null) {
                employeesNumber++;
            }
        }
        return calculateTotalSalary() / employeesNumber;
    }

    public static void printEmployeesNames() {
        for (Employee employee : staff) {
            if (employee != null) {
                System.out.println("ФИО сотрудника: " + employee.getFullName());
            }
        }
    }
}