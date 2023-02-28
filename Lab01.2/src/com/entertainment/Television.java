package com.entertainment;

import java.util.Comparator;
import java.util.Objects;

public class Television implements Comparable<Television> {

    private String brand;
    private int volume;

    private Tuner tuner = new Tuner();

    int getCurrentChannel(){
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

//  Constructors
    public Television() {
    }

    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

//
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int compareTo(Television other) {
        return this.getBrand().compareTo(other.getBrand());
    }

    @Override
    public boolean equals(Object obj) {
        // if I am the same physical object as obj
        if (this == obj) return true;
        // if obj is null OR I and obj are not the same type
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Television that = (Television) obj;
        return this.getVolume() == that.getVolume() &&
                Objects.equals(getBrand(), that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }

    /* @Override
    public int hashCode() {
//        return getBrand().length() +getVolume();
//        we can use java.util.Objects to help us create a "scientifically correct" hash function,
//        i.e., one that minimizes the probability of hash collisions.
        return Objects.hash(getBrand(), getVolume());
    }

    public boolean equals(Object obj) {
        boolean result = false;
        // proceed only if obj is really a reference to a television object
        if (obj instanceof Television) {
           // safely downcast to more specific type, so we can call Television methods
           Television other = (Television) obj;
            result = Objects.equals(this.getBrand(), other.getBrand()) &&
                    this.getVolume() == other.getVolume();
        }

        return result;
    }*/

    @Override
    public String toString() {
        return getClass().getSimpleName() + "brand: " + getBrand() +
                ". Volume: " + getVolume() + ". Current channel: " +  getCurrentChannel();
     }
}