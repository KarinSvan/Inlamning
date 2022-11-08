package Inlamning;

public class Counter {
    //radräknare
    int lines = 0;

    //teckenräknare
    int chars = 0;

    //metod för att räkna rader och tecken
    public void countLinesAndChars(String line) {
        lines++;
        //kollar hur lång inskickade raden är = antal tecken
        chars += line.length();
    }
}