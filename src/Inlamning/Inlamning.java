package Inlamning;

import java.util.Scanner;

public class Inlamning {

    public static void main(String[] args) {
        String[] lineInput = new String[500];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your text, type stop to finish.");
        //class  object
        Counter counter = new Counter();

        int lineCounter=0;
        boolean isReading = true;

        while (isReading){

            lineInput[lineCounter] = scan.nextLine();

            if (lineInput[lineCounter].equals("stop")) {
                isReading = false;
            }
            else {
                //Använder metoden countLinesAndChars från Counter
                counter.countLinesAndChars(lineInput[lineCounter]);
                lineCounter++;
            }
        }

        //Hämtar lines och counter
        System.out.println("Number of lines: " + counter.getLines() + "\nNumber of chars: " + counter.getChars());
    }
}

