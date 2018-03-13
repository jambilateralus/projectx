package models;

public class FingerPrint {
    private String leftSide;
    private String rightSide;
    private String middle;

    public FingerPrint(String leftSide, String rightSide, String middle) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.middle = middle;
    }

    public String getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(String leftSide) {
        this.leftSide = leftSide;
    }

    public String getRightSide() {
        return rightSide;
    }

    public void setRightSide(String rightSide) {
        this.rightSide = rightSide;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }
}
