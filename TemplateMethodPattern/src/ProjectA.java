public class ProjectA extends AbstractProject {
    @Override
    protected void doNeed() {
        System.out.println("采用座谈会收集需求...");
    }

    @Override
    protected void doDesign() {
        System.out.println("采用Axure进行设计...");
    }

    @Override
    protected void doRealized() {
        System.out.println("采用瀑布方式进行开发...");
    }

    @Override
    protected void doTest() {
        System.out.println("采用集中交付测试...");
    }
}
