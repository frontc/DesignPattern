public class Main {

    public static void main(String[] args) {
        Singleton.say(); //没有实例化将打印 null
        Singleton singleton1=Singleton.getSingleton();
        singleton1.say();
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        Singleton singleton2=Singleton.getSingleton();
        singleton2.say(); //可以看到虽然等待了1秒，但两次打印的时间相同
    }
}
