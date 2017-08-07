public abstract class AbstractProject {
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
        this.doNeed();
        this.doDesign();
        this.doRealized();
        this.doTest();
    }
}
