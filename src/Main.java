public class Main {
    public static void main(String[] args) {
        printSimpleMessage();
        countSum(5,10);
        printMessageFromUser("Scrum Master");
        System.out.println("Program");
    }

    private static void printSimpleMessage() {
        System.out.println("Simple message");
    }

    private static int countSum(int a, int b) {
        return a + b;
    }

    public static void printMessageFromUser(String msg) {
        System.out.println(msg);
    }
}
