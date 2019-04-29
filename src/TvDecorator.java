public class TvDecorator extends Decorator {

    public TvDecorator(DeviseFunctional devise) {
        super(devise);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("START TV watching");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("STOP TV watching");
    }
}
