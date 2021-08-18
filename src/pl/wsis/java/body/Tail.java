package pl.wsis.java.body;

public class Tail {

    // wag his tail when he is pleased

    public int x = 2;

    public String wagTail() {
        do {
            System.out.println("wag my tail: " + x + " times");
            x++;
            System.out.println("\n");
        }
        while (x < 5);
        return "see my master! i am happy now!";
    }

    // tail is up (confident)
    // tail is down (scared)

    //poprawić ::::::::::::::::: poniższy: if(tailDown)
    public boolean tailUp = true;
    public boolean tailDown = false;

    public String up() {
        if (tailUp)
            return "tail is up!";
        if (tailDown)
            return "tail is down!";
        else {
            return "is ok";
        }
    }
}
