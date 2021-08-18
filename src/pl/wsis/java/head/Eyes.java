package pl.wsis.java.head;

public class Eyes {

    public String camera = "in eyes";

    public String eyesColour = "green";
    public int width = 3840;
    public int height = 2160;

    public static  int MAX_HEIGHT = 3840;

    public static int getMaxHeight() {
        return MAX_HEIGHT;
    }

    public boolean closeEyes() {
        //System.out.println("Eyes are closed now.");
        return false;
    }

    public boolean openEyes()   {
        //System.out.println("Eyes are opened !");
        return true;
    }

    // what the eyes see and what is the brain think about what they see:
    // my master :)
    // a friend of my master
    // stranger ! reserved with strangers
}