import java.util.ArrayList;

/**
 * A类项目的建造者
 *
 * @author web
 * @version 1.0
 * @since 2017/09/10 14:50
 */
public class BuilderA extends AbstactBuilder {
    private ArrayList<String> sequence;

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    @Override
    public AbstractProject getProject() {
        AbstractProject project = new ProjectA();
        project.setSequence(sequence);
        return project;
    }
}
