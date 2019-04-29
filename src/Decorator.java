public abstract class Decorator implements DeviseFunctional {
    private DeviseFunctional devise;

    public Decorator(DeviseFunctional devise) {
        this.devise = devise;
    }

    @Override
    public void turnOn(){
        devise.turnOn();
    }

    @Override
    public void turnOff() {
        devise.turnOff();
    }
}
