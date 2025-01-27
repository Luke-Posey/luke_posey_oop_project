package week1.PolymorphismAndInheritance1_10;

public class HandheldGameConsole extends GameConsole {

    public int batteryLife;

    public HandheldGameConsole(int processorHertz, String displayType) {
        super(processorHertz, displayType);
        this.batteryLife = 8;// Lets say most HandHeld Game consoles have 8 hours of battery life.
    }

    public HandheldGameConsole(int batteryLife, int processorHertz, String displayType) {
        super(processorHertz, displayType);
        this.batteryLife = batteryLife;
    }

    public void lowerSound() {

    }

    public void raiseSound() {

    }

}
