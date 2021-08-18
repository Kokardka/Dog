package pl.wsis.java.body;

public class Fur {

    public String furColour = "white";
    public String furTouch = "fluffy";
    public int howManyColours = 1;

    // covers its body

    public String clean() {
        if (furColour.equals("white"))
            return "the fur is clean";
        else
            return "the fur is dirty";
    }

    public void clean1() {
        for (furTouch = "fluffy"; howManyColours == 1; howManyColours++) {
            System.out.println("so fluffy and clean");
        }
    }
}
