public class ProjectB extends AbstractProject {
    @Override
    protected void doNeed() {
        System.out.println("采用调查问卷收集需求...");
    }

    @Override
    protected void doDesign() {
        System.out.println("采用墨刀进行设计...");
    }

    @Override
    protected void doRealized() {
        System.out.println("采用迭代方式进行开发...");
    }

    @Override
    protected void doTest() {
        System.out.println("采用持续集成交付测试...");
    }
}
