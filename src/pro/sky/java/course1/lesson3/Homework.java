package pro.sky.java.course1.lesson3;

import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int iOS = 0;
        int android = 1;
        int clientOS = iOS;
        if (clientOS == iOS) {//Советуем пользователю скачать для iOS
            System.out.println("Установите версию приложения для iOS из AppStrore по ссылке");
        } else if (clientOS == android) {//Советуем пользователю скачать для Android
            System.out.println("Установите версию приложения для Android из Play Market по ссылке");
        } else {//Указываем на то, что у пользователя незнакомая OS
            System.out.println("Устройство не определено");
        }
    }

    public static void task2() {
        int iOS = 0;
        int android = 1;
        int clientOS = iOS;
        int clientDeviceYear = 2015;
        if (clientOS == iOS && clientDeviceYear >= 2019) {//Советуем пользователю скачать для iOS
            System.out.println("Установите версию приложения для iOS из AppStrore по ссылке");
        } else {//для версий iOS старше 2019 года
            if (clientDeviceYear < 2019 && clientOS == iOS) {
                System.out.println("Установите lite-версию приложения для iOS из AppStrore по ссылке");
            }
        }
        if (clientOS == android && clientDeviceYear >= 2019) {//Советуем пользователю скачать для Android
            System.out.println("Установите версию приложения для Android из Play Market по ссылке");
        } else {//для версий Android старше 2019 года
            if (clientDeviceYear < 2019 && clientOS == android) {
                System.out.println("Установите lite-версию приложения для Android из Play Market по ссылке");
            }
        }
        if (clientOS < 0 || clientOS > 1) {//Указываем на то, что у пользователя незнакомая OS
            System.out.println("Устройство не определено");
        }
    }


    public static void task3() {
        int year = 2012;
        if (year % 400 == 0) {//Год делится на 400 без остатка, знач високосный.
            System.out.println("Год високосный. Нужно платить больше :-(");
        } else if (year % 4 == 0 && year % 100 != 0) {//Год тоже високосный, поскольку на 4 делится и не кратен 100.
            System.out.println("Год високосный. Нужно платить больше :-(");
        } else {// Год не високосный. Можно не париться)
            System.out.println("Год не високосный. Платим как обычно.");
        }
    }


    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {//1 день
            System.out.println("Доставка банковской карты займёт " + deliveryDays + "сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {//Доставка на сутки дольше (2 дня)
            System.out.println("Доставка банковской карты займёт " + (deliveryDays + 1) + " суток.");
        } else if (deliveryDistance > 60) {//Доставка еще на день больше (3 дня)
            System.out.println("Доставка банковской карты займёт " + (deliveryDays + 1 + 1) + " суток.");
        }
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Не знаю такого месяца :(");
        }
    }
}