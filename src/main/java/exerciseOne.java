import java.util.Scanner;

public class exerciseOne {
    public static void main(String[] args) {


        printUserName();
        System.out.println(calculatePowerOfInt(9));

    }

    public static void printUserName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, bitte gib deinen Namen ein:");

        String name = scanner.nextLine();

        System.out.println("Hallo " + name + ". Schön das du da bist!");
    }

    public static double calculatePowerOfInt(int num){
        return Math.pow(num, 2);
    }
}
