import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("need");
        sequence.add("design");
        sequence.add("test");
        AbstactBuilder builderA1= new BuilderA();
        builderA1.setSequence(sequence);
        System.out.println("-----------------");
        builderA1.getProject().doProject();
        AbstactBuilder builderA2= new BuilderA();
        sequence.clear();
        sequence.add("realized");
        sequence.add("test");
        builderA2.setSequence(sequence);
        System.out.println("-----------------");
        builderA2.getProject().doProject();
        AbstactBuilder builderB1= new BuilderB();
        sequence.clear();
        sequence.add("realized");
        sequence.add("test");
        builderB1.setSequence(sequence);
        System.out.println("-----------------");
        builderB1.getProject().doProject();
        sequence.clear();
        sequence.add("need");
        sequence.add("design");
        sequence.add("test");
        AbstactBuilder builderB2= new BuilderB();
        builderB2.setSequence(sequence);
        System.out.println("-----------------");
        builderB2.getProject().doProject();
    }
}
