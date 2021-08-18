package pl.wsis.java.head;

import java.util.ArrayList;
import java.util.List;

public class Ears {

    public String sound1 = "look!";
    public String sound2 = "my name";
    public String sound3 = "come!";
    public String sound4 = "with me!";
    public String sound5 = "leave it!";
    public String sound6 = "drop it!";
    public String sound7 = "sit!";
    public String sound8 = "lie down!";
    public String sound9 = "stay!";
    public String sound10 = "wait!";
    public String sound11 = "paw!";

    public List<String> list;

    public Ears() {
        list = new ArrayList<>();
        list.add(sound1);
        list.add(sound2);
        list.add(sound3);
        list.add(sound4);
        list.add(sound5);
        list.add(sound6);
        list.add(sound7);
        list.add(sound8);
        list.add(sound9);
        list.add(sound10);
        list.add(sound11);
    }

    public List<String> getList() {
        return  list;
    }
}
