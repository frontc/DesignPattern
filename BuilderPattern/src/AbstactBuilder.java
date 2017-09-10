import java.util.ArrayList;

/**
 * 抽象的建造者
 *
 * @author web
 * @version 1.0
 * @since 2017/09/10 14:38
 */
public abstract class AbstactBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract AbstractProject getProject();
}
