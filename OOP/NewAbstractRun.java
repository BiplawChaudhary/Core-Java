package OOP;

public class NewAbstractRun extends NewAbstractClass{
    public void run(){
        System.out.println("RUNNING");
    }

    public static void main(String[] args) {
        NewAbstractRun run1 = new NewAbstractRun();

        run1.run();


    }
}
