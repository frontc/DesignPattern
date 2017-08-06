public class Main {
    public static void main(String[] args) {
        AbstractFactory bmwCreator = new BMWFactory();
        AbstractCarBody bmwCarBody = bmwCreator.createCarBody();
        AbstractCarWheel bmwWheel = bmwCreator.createWheel();
        bmwCarBody.open();
        bmwWheel.run();

        AbstractFactory audiCreator = new AudiFactory();
        AbstractCarBody audiCarBody = audiCreator.createCarBody();
        AbstractCarWheel audiWheel = audiCreator.createWheel();
        audiCarBody.open();
        audiWheel.run();
    }
}