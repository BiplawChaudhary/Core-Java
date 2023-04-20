public class first {
    public static void main(String[] args){
        System.out.println("HEllo");
        System.out.println("Hiii");
        // Putting the thread to sleep
        try{
            Thread.sleep(2000);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
        System.out.println("CHao");
    }
}
