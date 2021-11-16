package pro.sky.java.course2.lesson1;

public class ServiceStation {
    public void check(Transport trans) {
        System.out.println("Обслуживаем " + trans.getModelName());
        trans.check();
    }
}