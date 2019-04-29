public class TestClass {
    public static void main(String[] args) {
        Devise myDevise = new Devise();
        //DeviseFunctional test = new AudioCenterDecorator(new TvDecorator(myDevise));
        DeviseFunctional test = new AudioCenterDecorator(myDevise);
        test.turnOn();
        test.turnOff();
    }
}
