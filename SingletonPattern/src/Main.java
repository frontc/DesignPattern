public class Main {

    public static void main(String[] args) {
        Singleton singleton1=Singleton.getSingleton();
        singleton1.say();
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        Singleton singleton2=Singleton.getSingleton();
        singleton2.say();
    }
}
