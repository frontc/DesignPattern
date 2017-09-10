import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstractProject {
    private ArrayList<String> sequence;
    // 每个项目都需要需求调研
    abstract protected void doNeed();
    // 每个项目都需要系统设计
    abstract protected void doDesign();
    // 每个项目都需要开发实现
    abstract protected void doRealized();
    // 每个项目都需要测试交付
    abstract protected void doTest();
    // 做项目就是以上方法的组合
    public void doProject(){
        for(String step:sequence){
            if(Objects.equals(step,"need")){
                this.doNeed();
            }
            if(Objects.equals(step,"design")){
                this.doDesign();
            }
            if(Objects.equals(step,"realized")){
                this.doRealized();
            }
            if(Objects.equals(step,"test")){
                this.doTest();
            }
        }
    }
    public void setSequence(ArrayList<String> sequence){
        this.sequence=sequence;
    }
}
