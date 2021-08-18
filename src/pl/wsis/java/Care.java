package pl.wsis.java;

public class Care {

    int battery = 0;

    // nutrition - dog food, treats

    // grooming - daily brushing, occasional bath

    // exercise - energy level - energetic - regular exercise

    // training - trainability - may be stubborn

    // health - sensitive but free from diseases

    public Object careNeed(int careNeed) {

        switch (careNeed) {
            case 1:
                System.out.println("nutrition");
                break;
            case 2:
                System.out.println("grooming");
                break;
            case 3:
                System.out.println("exercise");
                break;
            case 4:
                System.out.println("training");
                break;
            case 5:
                System.out.println("health");
                break;
        }
        return "need !";
    }

    // battery !!!

    public String batteryCharge() throws InterruptedException {
        do {
            System.out.println("battery need to charge: " + battery + "%");
            battery = battery + 10;
            // or "battery++;" and it will be 1,2,3,4,5... etc. until 100
            System.out.println("\n");
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        }
        while (battery < 100);
        return "see my master! i am happy now!";
    }
}
