package pro.sky.java.course1.lesson2;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte a;
        a = -128;
        short b;
        b = -32_768;
        int c;
        c = -2_147_483_648;
        long d;
        d = -9_223_372_036_854_775_808L;
        float e;
        e = -0.000_001f;
        double f;
        f = -0.123_456_789_123;
        char g;
        g = '?';
        boolean h;
        h = false;
    }

    public static void task2() {
        float first;
        first = 78.2f;
        float second;
        second = 82.7f;
        float summa;
        summa = first + second;
        System.out.println("Общий вес двух бойцов " + summa + " кг");
        System.out.println("Разница между весами " + Math.abs(first - second) + " кг");

    }

    public static void task3() {
        short bananas;
        bananas = 80 * 5;
        short milk;
        milk = 200;
        milk = 105 * 2;
        short ice_cream;
        ice_cream = 2 * 100;
        short eggs;
        eggs = 4 * 70;
        System.out.println("Вес завтрака в граммах: " + (bananas + milk + ice_cream + eggs) + " г");
        int breakfast;
        breakfast = bananas + milk + ice_cream + eggs;
        double breakfastKg = breakfast / 1000.0;
        System.out.println("Вес завтрака в килограммах: " + breakfastKg + " кг");
    }

    public static void task4() {
        byte TotalWeight = 7;
        float MinimumPerDay = 0.25F;
        float MaximumPerDay = 0.5F;
        double SlowLosing = TotalWeight / MinimumPerDay; //28 days
        double FastLosing = TotalWeight / MaximumPerDay; //14 days
        double AverageLosing = (SlowLosing + FastLosing) / 2; // 21 day
        System.out.println("Среднее количество дней, чтобы добиться похудения: " + AverageLosing + " день");
    }

    public static void task5() {
        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;
        double MashaPromotion = Masha + (Masha / 100.0 * 10); //74536 roubles
        double DenisPromotion = Denis + (Denis / 100.0 * 10); //92059 roubles
        double KristinaPromotion = Kristina + (Kristina / 100.0 * 10); //83853 roubles
        double MashaYearIncomeBefore = Masha * 12; // 813120
        double MashaYearIncomeAfter = (MashaPromotion * 12); //894432
        double DenisYearIncomeBefore = Denis * 12;//1004280
        double DenisYearIncomeAfter = DenisPromotion * 12;//1104708
        double KristinaYearIncomeBefore = Kristina * 12;//914760
        double KristinaYearIncomeAfter = KristinaPromotion * 12;//1006236
        System.out.println("Маша теперь получает " + MashaPromotion + " рублей." + " Годовой доход вырос на " + (MashaYearIncomeAfter - MashaYearIncomeBefore) + " рублей");
        System.out.println("Денис теперь получает " + DenisPromotion + " рублей." + " Годовой доход вырос на " + (DenisYearIncomeAfter - DenisYearIncomeBefore) + " рублей");
        System.out.println("Кристина теперь получает " + KristinaPromotion + " рублей." + " Годовой доход вырос на " + (KristinaYearIncomeAfter - KristinaYearIncomeBefore) + " рублей");
    }
}
