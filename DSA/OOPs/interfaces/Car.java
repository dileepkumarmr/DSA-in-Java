package OOPs.interfaces;

public class Car implements Engine, Brake, Media {

    int a = 30;

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void start() {
        System.out.println("Start Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate");
    }
}
