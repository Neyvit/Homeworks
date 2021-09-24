package pro.sky.java.course1.lesson6;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4_1();
        task4_2();

    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich"; // Можно было еще одну строку было сделать. Я сначала так и сделал. А потом переделал.
        // Зачем лишнюю строку кода писать и загружать лишним память =)
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    public static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace(" ", ";"));
    }

    public static void task4_1() {//4 задание без методов split и contains. Так тоже работает.
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё", "е"));
    }

    public static void task4_2() {//4 задание c методом contains и проверкой строки через условный оператор.
        // Зачем там может понадобиться метод split, мне не совсем понятно. Делал без него.
        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё", "е"));
        } else {
            System.out.println("Данные ФИО сотрудника - " + fullName);
        }
    }
}