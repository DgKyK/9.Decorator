public class Devise implements DeviseFunctional {
    private String name;

    public Devise() {
        this.name = "SmartDevise";
    }

    @Override
    public void turnOn() {
        System.out.println(this.name + " is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(this.name + " is OFF");
    }
}
