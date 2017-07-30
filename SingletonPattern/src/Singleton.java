import java.time.LocalTime;
import java.util.Date;

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

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void say() {
        System.out.println(createDate);
    }
}
