import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printSimpleMessage();

        substract(5,10);
        printMessageFromUser();
        System.out.println("Program");
    }
    private static void printUserName(String name){

        System.out.println("User name: " + name);

    }
    private static void printSimpleMessage() {
        System.out.println("Simple message");
        System.out.println("Simple message added from Maks Chornyi");
    }

    private static int substract(int a, int b) {
        return a - b;
    }

    public static void printMessageFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
}
