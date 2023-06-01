
import java.util.Scanner;

public class exerciseOne {
    //TODO Kommentare lassen sich nicht pushen??
    //TODO Warum muss dieses Klassen Array static sein?
    static String [] wordsOfNumbers = {"Null","Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun"};

    public static void main(String[] args) {


       printUserName();

        System.out.println(calculatePowerOfInt(9));

        System.out.println(determineWordOfNumber(4));

       printNumbers();

        inputWords();
    }

    //Hier das muss ich kommentieren
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

    public static void inputWords(){
        String [] array = new String[100];

        boolean exit = true;
        boolean wantPrint = true;
        int counter = 0;
        String tempInput = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey user, hier kannst du bis zu einhundert Wörter eingeben und diese temporär speichern.");
        System.out.println("Wenn du deine Wörter ausgeben möchtest gib 'p' in die Konsole ein.");
        System.out.println("Wenn du das Programm beenden möchtest gib 'e in die Konsole ein.");
        System.out.println("Bist du bereit?? Dann bestätige mit Enter.");
        scanner.nextLine();
        System.out.println("Los geht´s!");

        do {

                    System.out.println("Gib dein " + (counter + 1) + " Wort ein!");

                    tempInput = scanner.nextLine();
                    if (tempInput.equals("p")){
                        for (int i = 0; i < counter; i++){
                            System.out.println((i+1) + ". " + array[i]);
                        }
                    }else if (tempInput.equals("e")){
                        exit = false;
                    }else{
                        array[counter] = tempInput;
                    }
                    if (counter == 99){
                        exit = false;
                    }

                counter++;
        }while(exit);
    }
}
