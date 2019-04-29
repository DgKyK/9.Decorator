public class AudioCenterDecorator extends Decorator {

    public AudioCenterDecorator(DeviseFunctional devise) {
        super(devise);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Music START playing...");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Music STOP playing...");
    }
}
