package day55_abstraction.flegs;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        SerbianFlag serbianFlag = new SerbianFlag();
        serbianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();

       UkraineFlag ukraineFlag = new UkraineFlag();
       ukraineFlag.draw();
    }
}
