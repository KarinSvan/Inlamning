package Inlamning;

import java.util.Scanner;

public class Inlamning {

    public static void main(String[] args) {
        String[] lineInput = new String[500];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your text, type stop to finish.");
        int lineCounter=0;
        boolean isReading = true;

        while (isReading){

            lineInput[lineCounter] = scan.nextLine();

            if (lineInput[lineCounter].equals("stop")) {
                isReading = false;
            }
            else {
                lineCounter++;
            }
        }
        //class  object
        Counter counter = new Counter();

        int index = 0;

        while (index<lineCounter){
            counter.countLinesAndChars(lineInput[index]);
            index++;
        }

        System.out.println("Number of lines: " + counter.lines + "\nNumber of chars: " + counter.chars);
    }
}

