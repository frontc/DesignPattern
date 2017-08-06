public class BMWFactory extends AbstractFactory{
    @Override
    public AbstractCarBody createCarBody() {
        return new BMWCarBody();
    }

    @Override
    public AbstractCarWheel createWheel() {
        return new BMWCarWheel();
    }
}
