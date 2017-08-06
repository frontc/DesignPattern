public class AudiFactory extends AbstractFactory{
    @Override
    public AbstractCarBody createCarBody() {
        return new AudiCarBody();
    }

    @Override
    public AbstractCarWheel createWheel() {
        return new AudiCarWheel();
    }
}