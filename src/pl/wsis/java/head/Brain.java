package pl.wsis.java.head;

public class Brain {
    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Eyes eyes;

    /*
    public void closeEyes(Eyes eyes) {
        boolean areClosed = eyes.closed();

        if (areClosed) {
            System.out.println("Eyes are closed now.");
        } else {
            System.out.println("Eyes are opened !");
        }
    }
    */

    // to co wyżej zakomentowane ale bez else:
    public String closeEyes(Eyes eyes) {
        if (eyes.closeEyes()) {
        }
        return "Eyes are closed now.";
    }

    public String openEyes(Eyes eyes) {
        if (eyes.openEyes()) {
        }
        return "Eyes are opened !";
    }

    // basic dog training commands

    // i am hungry

    // friends of mine - other dogs, cats, animals
}
