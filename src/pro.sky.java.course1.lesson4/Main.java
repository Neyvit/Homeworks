package pro.sky.java.course1.lesson4;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 1;
        while (i < 11)
            System.out.print(i++ + " ");
        System.out.print("\n");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        System.out.print("\n");
        for (int fridayReport = 3; fridayReport <= 31; fridayReport = fridayReport + 7) {
            System.out.println("Сегодня пятница, " + fridayReport + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int currentYear = 2021;
        int cometLastTimes = currentYear - 200;
        int cometNextTime = currentYear + 100;
        for (int cometYears = cometLastTimes; cometYears <= cometNextTime; cometYears++) {
            if (cometYears % 79 == 0) {
                System.out.println(cometYears);
            }
        }
    }
}
