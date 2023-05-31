import java.util.Scanner;

public class exerciseOne {
    //TODO Warum muss dieses Klassen Array static sein?
    static String [] wordsOfNumbers = {"Null","Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun"};

    public static void main(String[] args) {


      //  printUserName();

        //System.out.println(calculatePowerOfInt(9));

      //  System.out.println(determineWordOfNumber(4));

        printNumbers();
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

    public static String determineWordOfNumber(int num){
        //TODO numWord musste initialisiert werden ansonsten gab es eine Fehlermeldung, unten bei return numWord!?
        String numWord = null;

        for (int i = 0; i <= 9; i++){

            if(num == i){
                numWord = wordsOfNumbers[i];
            }
        }
        return numWord;

    }

    public static void printNumbers(){

        for(int i = 1; i <= 100; i++){

            if (i%5 == 0 && i%3 == 0){
                System.out.println("#$" + i);
            }else if (i%5 == 0){
                System.out.println("$" + i);
            }else if (i%3 == 0){
                System.out.println("#" + i);
            }else {
                System.out.println(i);
            }
        }
    }
}
