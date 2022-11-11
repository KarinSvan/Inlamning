package Inlamning;

public class Counter {
    //radräknare
    private int lines = 0;

    //teckenräknare
    private int chars = 0;

    //metod för att räkna rader och tecken
    public void countLinesAndChars(String line) {
        lines++;
        //kollar hur lång inskickade raden är = antal tecken
        chars += line.length();
    }

    //metod som returnerar antalet lines
    public int getLines(){
        return lines;
    }

    //metod som returnerar antalet chars
    public int getChars(){
        return chars;
    }
}