package pro.sky.java.course1.lesson7;

public class Main {
    public static void main(String[] args) {

        defineYear(300);
        getAppVersion(0, 2021);
        validateText(95);
        sortString("reddit");
        reverseArray(new int[]{3, 2, 1, 6, 5});

    }

    public static void defineYear(int leapYear) {
        if ((leapYear % 4 == 0 || leapYear % 100 != 0) && leapYear % 400 == 0) {
            System.out.println(leapYear + " - високосный год");
        } else {
            System.out.println(leapYear + " - невисокосный год");
        }
    }

    public static void getAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = 2021;
        if (clientOS < 0 || clientOS > 1) {//Указываем на то, что у пользователя незнакомая OS
            System.out.println("Устройство не определено");
        } else if (clientOS == 1) {//Советуем пользователю скачать для iOS
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS из AppStrore по ссылке");
            } else {//телефон не потянет обычную версию
                System.out.println("Установите lite-версию приложения для iOS из AppStrore по ссылке");
            }
        } else {//Советуем пользователю скачать для android
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android из Play Market по ссылке");
            } else {//телефон не потянет обычную версию
                System.out.println("Установите lite-версию приложения для Android из Play Market по ссылке");
            }
        }
    }

    public static void validateText(int deliveryDistance) {
        int deliveryDays = 1;//обычные условия доставки
        if (deliveryDistance > 20) {//+1 день доставки
            deliveryDays++;
        }
        if (deliveryDistance > 60) {//Доставка на сутки дольше (2 дня)
            deliveryDays++;
        }
        System.out.println("Доставка банковской карты займёт " + deliveryDays + " суток.");
    }

    public static void sortString(String abc) {
        char[] symbols = abc.toCharArray();
        for (int i = 1; i < symbols.length; i++) {
            if (symbols[i] == symbols[i - 1]) {
                System.out.println("Обнаружен дубль - " + symbols[i] + ".");
                return;
            }
        }
        System.out.println("Дубли отсутствуют.");
    }

    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}