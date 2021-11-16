package pro.sky.java.course2.lesson1;

public abstract class TransportWithTrailer extends TransportWithEngine{

    public TransportWithTrailer(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
        checkTrailer();
    }
}