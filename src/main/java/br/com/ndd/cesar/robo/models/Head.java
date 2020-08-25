package br.com.ndd.cesar.robo.models;

public class Head {
    private HeadInclination headInclination;
    private HeadInclination headInclinationCurrent;

    public Head() {
        this.headInclination = headInclination.REST;
        this.headInclinationCurrent = headInclinationCurrent.REST;
    }

    public Head(HeadInclination headInclination, HeadInclination headInclinationCurrent) {
        this.headInclination = headInclination.REST;
        this.headInclinationCurrent = headInclinationCurrent.REST;
    }

    public HeadInclination getHeadInclination() {
        return headInclination;
    }

    public void setHeadInclination(HeadInclination headInclination) {
        this.headInclination = headInclination;
    }

    public HeadInclination getHeadInclinationCurrent() {
        return headInclinationCurrent;
    }

    public void setHeadInclinationCurrent(HeadInclination headInclinationCurrent) {
        this.headInclinationCurrent = headInclinationCurrent;
    }
}
