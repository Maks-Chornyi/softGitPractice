public class Main {
    public static void main(String[] args) {
        printSimpleMessage();

        substract(5,10);
        printMessageFromUser("Scrum Master");
        System.out.println("Program");
    }
    private static void printUserName(String name){
<<<<<<< HEAD
        System.out.println("User name: " + name);
=======
        System.out.println("User name: " +name);
>>>>>>> afee85a0dc7e4727913b359f318576a1d8e6fc51
    }
    private static void printSimpleMessage() {
        System.out.println("Simple message");
        System.out.println("Simple message added from Maks Chornyi");
    }

    private static int substract(int a, int b) {
        return a - b;
    }

    public static void printMessageFromUser(String msg) {
        System.out.println(msg);
    }
}
