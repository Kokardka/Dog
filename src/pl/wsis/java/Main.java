package pl.wsis.java;

import pl.wsis.java.body.*;
//powyższe z * lub:
//import pl.wsis.java.body.BackPaws;
//import pl.wsis.java.body.FrontPaws;
//import pl.wsis.java.body.Fur;
//import pl.wsis.java.body.Tail;
import pl.wsis.java.head.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // utworzenie obiektów poszczególnych klas (patrz program person):

        Eyes eyes = new Eyes();

        Brain brain = new Brain();

        Mouth mouth = new Mouth();

        Nose nose = new Nose();

        Ears ears = new Ears();

        Fur fur = new Fur();

        Care care = new Care();

        Breed breed = new Breed(1, "a", 2.0);

        BackPaws backPaws = new BackPaws(5, "trol", 5.5);

        FrontPaws frontPaws = new FrontPaws();

        Tail tail = new Tail();

        // println:

        System.out.println("Informations about me:");
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // println dla klasy eyes:

        System.out.println(eyes.eyesColour);
        System.out.println(eyes.height);
        System.out.println(eyes.width);
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // println dla klasy brain:

        System.out.println(brain.closeEyes(eyes));
        System.out.println(brain.openEyes(eyes));
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // println dla klasy mouth:

        System.out.println("How many teeth have your dog?" + " = " + 42);
        System.out.println(mouth.noise);
        System.out.println(mouth.less1());
        System.out.println(mouth.lessSome());
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // println dla klasy nose:

        System.out.println(nose.isMyNoseBetter());
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // println dla klasy tail:

        System.out.println(tail.wagTail());
        System.out.println(tail.up());
        System.out.println();
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // println dla klasy fur:

        System.out.println(fur.clean());
        System.out.println(fur.furTouch);
        fur.clean1();
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // array list from ears class:
        System.out.println(ears.getList());
        System.out.println(ears.sound3);
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        // z zajęć wykorzystanie konstruktorów:
        System.out.println(breed.a + " " + breed.b + " " + breed.c);

        // z zajęć modyfikator dostępu:
        backPaws.setA(2);

        System.out.println("a= " + backPaws.getA());
        System.out.println("b= " + backPaws.b);
        System.out.println("c= " + backPaws.getC());

        // println dla klasy frontPaws:

        System.out.println(frontPaws.pawLeft);
        System.out.println(frontPaws.up());

        // println dla klasy care:

        System.out.println(care.careNeed(3));
        System.out.println(care.careNeed(1));
        care.batteryCharge();
        System.out.println(care.batteryCharge());

        // napisać konstruktory dla klas
    }
}
