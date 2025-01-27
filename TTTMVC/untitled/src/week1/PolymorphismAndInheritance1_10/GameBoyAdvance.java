package week1.PolymorphismAndInheritance1_10;

public class GameBoyAdvance extends GameBoyColor {
    boolean isInAdvancedMode;
    public GameBoyAdvance(int processorHertz, String displayType) {
        super(processorHertz, displayType);
        this.isInAdvancedMode = true;
    }

    public boolean isRunningInAdvancedMode() {
        return isInAdvancedMode;
    }

}
