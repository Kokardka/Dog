package pl.wsis.java.head;

public class Mouth {

    public String noise = "bark";
    public int teeth = 42;

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String less1() {
        while (teeth > 39) {
            System.out.println(--teeth);
        }
        return "wanna new teeth!";
    }

    public String lessSome() {
        if (teeth < 42) {
        }
        return "Lose teeth";
    }

    // for control flow
    public void brushTeeth() {
        for (teeth = 42; teeth <= 42; teeth++) {
            System.out.println("need to brush teeth" + teeth++);
        }
    }
}
