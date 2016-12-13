public class HelloWorld {
    private String message;
    
    public HelloWorld(String message){
        this.message = message;
    }
    /*public static void main(String[] args) {
        System.out.println("Hello World");
    }*/
    
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
