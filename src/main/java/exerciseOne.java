
import java.util.Scanner;

public class exerciseOne {


    public static void main(String[] args) {


      //  printUserName();

        //System.out.println(calculatePowerOfInt(9));

      //  System.out.println(determineWordOfNumber(4));

       // printNumbers();

       // inputWords();
        System.out.println(highAndLow("2 4 -1 7 1 3"));
    }

    public static String highAndLow(String nums){
        String [] array = nums.split(" ");
        String result1 = null;
        String result2 = null;
        for (int i = 0; i<(array.length-1);i++){
            for (int j = 1; j<(array.length); j++){
                if (Integer.parseInt(array[i])>Integer.parseInt(array[j]) ){
                        result1 = array[i];
                }
                if (Integer.parseInt(array[i])<Integer.parseInt(array[j]) ){
                    result2 = array[i];
                }
            }
        }
        return result1 + " " + result2;
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
        return Integer.toString(num);

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
