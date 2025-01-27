package week1.PolymorphismAndInheritance1_10;

public class GameBoy extends HandheldGameConsole {

    public int numBatteries;

    public GameBoy(int processorHertz, String displayType) {
        super(4, processorHertz, displayType);
        this.numBatteries = 4; // The current iteration of the GameBoy had 4 batteries
    }

    public void checkForNintendoLicensedGame() {

    }

}
