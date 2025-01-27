package week1.PolymorphismAndInheritance1_10;

public class GameBoyColor extends GameBoy {
    public GameBoyColor(int processorHertz, String displayType) {
        super(processorHertz, displayType);
        this.numBatteries = 2;
    }

    public void shouldEnableColorUnit() {

    }

}
