package cs111b.lab816;

public class StringInstrument extends Instrument {
    private int numStrings;
    private int numFrets;
    private boolean isBowed;

    public void setNumOfStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void setNumOfFrets(int numFrets) {
        this.numFrets = numFrets;
    }

    public void setIsBowed(boolean isBowed) {
        this.isBowed = isBowed;
    }

    public int getNumOfStrings() {
        return this.numStrings;
    }

    public int getNumOfFrets() {
        return this.numFrets;
    }

    public boolean getIsBowed() {
        return this.isBowed;
    }
}
