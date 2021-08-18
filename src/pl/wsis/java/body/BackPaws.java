package pl.wsis.java.body;

public class BackPaws {
    //claws

    private int a;
    public String b;
    protected double c;

    public BackPaws (int wa, String wb, double wc) {
        a = wa;
        b = wb;
        c = wc;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return this.c;
    }

    /*
    // modyfikatory dostępu:

    private int twoLegs2;
    public String claws2;
    protected double scratch2;

    public BackPaws (int needPee1, String usingClaws2, double scratchPaw2) {
        twoLegs2 = needPee2;
        claws2 = usingClaws2;
        scratch2 = scratchPaw2;
    }

    public void setTwoLegs(int twoLegs2) {
        this.twoLegs2 = twoLegs2;
    }

    public int getClaws2() {
        return this.claws2;
    }

    public void setScratch2(double scratch2) {
        this.scratch2 = scratch2;
    }

    public double getScratch2() {
        return this.scratch2;
    }

    // twoLegs2 = 2;
    // claws2 = digging;
    // scratch2 = 2.0;
    */
}

