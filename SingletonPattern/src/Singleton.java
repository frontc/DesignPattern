import java.time.LocalTime;

/**
 * @author fang
 * @creatdate 17-7-30
 */
public class Singleton {
    private static Singleton singleton = null;
    private static LocalTime createDate = null;

    private Singleton() {
        createDate = LocalTime.now();
    }

    public static synchronized Singleton getSingleton() { //增加同步，防止高并发的场景出现线程不安全
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void say() {
        System.out.println(createDate);
    }
}
