package pl.wsis.java.body;

public class FrontPaws {

    //claws

    public String pawLeft = "pawLeftUp";
    public String pawRight = "pawRightUp";

    public String getPawLeft() {
        return pawLeft;
    }

    public String getPawRight() {
        return pawRight;
    }

    public String up() {
        if (pawRight.equals("pawRightUp"))
            return "paw right is up!";
        else
            return "paw left is up!";
    }

    // they can dig a hole ;)

    /*
    // modyfikatory dostępu:

    private int twoLegs1;
    public String claws1;
    protected double scratch1;

    public BackPaws (int needPlay1, String usingClaws1, double scratchPaw1) {
        twoLegs1 = play1;
        claws1 = usingClaws1;
        scratch1 = scratchPaw1;
    }

    public void setTwoLegs(int twoLegs1) {
        this.twoLegs1 = twoLegs1;
    }

    public int getClaws1() {
        return this.claws1;
    }

    public void setScratch1(double scratch1) {
        this.scratch1 = scratch1;
    }

    public double getScratch1() {
        return this.scratch1;
    }

    // twoLegs1 = 2;
    // claws1 = digging;
    // scratch1 = 2.0;
    */
}