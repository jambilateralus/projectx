package models;

public class Hand {
    private FingerPrint thumb;
    private FingerPrint index;
    private FingerPrint middle;
    private FingerPrint ring;
    private FingerPrint pinky;

    public Hand() {
    }

    public FingerPrint getThumb() {
        return thumb;
    }

    public void setThumb(FingerPrint thumb) {
        this.thumb = thumb;
    }

    public FingerPrint getIndex() {
        return index;
    }

    public void setIndex(FingerPrint index) {
        this.index = index;
    }

    public FingerPrint getMiddle() {
        return middle;
    }

    public void setMiddle(FingerPrint middle) {
        this.middle = middle;
    }

    public FingerPrint getRing() {
        return ring;
    }

    public void setRing(FingerPrint ring) {
        this.ring = ring;
    }

    public FingerPrint getPinky() {
        return pinky;
    }

    public void setPinky(FingerPrint pinky) {
        this.pinky = pinky;
    }
}
