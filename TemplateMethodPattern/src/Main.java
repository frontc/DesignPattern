public class Main {

    public static void main(String[] args) {
        AbstractProject project1 = new ProjectA();
        AbstractProject project2 = new ProjectB();
        project1.doProject();
        System.out.println("-------------------");
        project2.doProject();
    }
}
