import java.util.Scanner;

public class exerciseOne {
    public static void main(String[] args) {


        printUserName();


    }

    public static void printUserName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, bitte gib deinen Namen ein:");

        String name = scanner.nextLine();

        System.out.println("Hallo " + name + ". Schön das du da bist!");
    }
}
