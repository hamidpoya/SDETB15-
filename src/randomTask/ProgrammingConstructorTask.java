package randomTask;

public class ProgrammingConstructorTask {
    ProgrammingConstructorTask(){

        System.out.println("I love programming");
    }

    ProgrammingConstructorTask(String word){

        System.out.println("I love "+ word);
    }

    public static void main(String[] args) {
        new ProgrammingConstructorTask("Java");
    }
}
