package com.crunch;
// Natural order is determined by 'size' (double).
class Radish implements Comparable<Radish>{
    private String color;
    private double size;
    private double tailLength;
    private int sprouts;

    public Radish(String colour, double size, double tailLength, int sprouts) {
        setColor(colour);
        setSize(size);
        setTailLength(tailLength);
        setSprouts(sprouts);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getSprouts() {
        return sprouts;
    }

    public void setSprouts(int sprouts) {
        this.sprouts = sprouts;
    }

    @Override
    public int compareTo(Radish other) {
        return Double.compare(this.getSize(), other.getSize());
    }

    @Override
    public String toString() {
        return (" color: " + color +
                ", size: " + size +
                ", tailLength: " + tailLength +
                ", sprouts: " + sprouts + ".");
    }
}