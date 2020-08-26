package br.com.ndd.cesar.robo.models;

public class Arms {
    private int wristRotation;
    private ElbowContraction elbowContraction;

    public Arms() {
        this.wristRotation = 0;
        this.elbowContraction = ElbowContraction.REST;
    }

    public Arms(int wristRotation, ElbowContraction elbowContraction) {
        this.wristRotation = 0;
        this.elbowContraction = ElbowContraction.REST;
    }

    public ElbowContraction updateElbowContraction(ElbowContraction value) {
        if ((value == ElbowContraction.REST) || (value == ElbowContraction.CONTRACTED)) {
            switch (elbowContraction) {
                case REST: {
                    if (value == ElbowContraction.REST) {
                        this.elbowContraction = ElbowContraction.REST;
                    } else if (value == ElbowContraction.CONTRACTED) {
                        this.elbowContraction = ElbowContraction.SLIGHTLY_CONTRACTED;
                    }
                    break;
                }
                case SLIGHTLY_CONTRACTED: {
                    if (value == ElbowContraction.REST) {
                        this.elbowContraction = ElbowContraction.REST;
                    } else if (value == ElbowContraction.CONTRACTED) {
                        this.elbowContraction = ElbowContraction.CONTRACTED;
                    }
                    break;
                }
                case CONTRACTED: {
                    if (value == ElbowContraction.REST) {
                        this.elbowContraction = ElbowContraction.SLIGHTLY_CONTRACTED;
                    } else if (value == ElbowContraction.CONTRACTED) {
                        this.elbowContraction = ElbowContraction.STRONGLY_CONTRACTED;
                    }
                    break;
                }
                case STRONGLY_CONTRACTED: {
                    if (value == ElbowContraction.REST) {
                        this.elbowContraction = ElbowContraction.CONTRACTED;
                    } else if (value == ElbowContraction.CONTRACTED) {
                        this.elbowContraction = ElbowContraction.STRONGLY_CONTRACTED;
                    }
                    break;
                }
            }
        }
        return elbowContraction;
    }

    public ElbowContraction getElbowContraction() {
        return elbowContraction;
    }

    public int updateWristRotation(int value) {
        if (getElbowContraction()== ElbowContraction.STRONGLY_CONTRACTED) {
            if ((value == 1)&&(this.wristRotation<180)) {
                this.wristRotation = this.wristRotation + 45;
            } else if ((value == -1)&&(wristRotation>-90)) {
                this.wristRotation = wristRotation - 45;
            } else if (value == 0){
                this.wristRotation = 0;
            }
        }
        return this.wristRotation;
    }

    public int getWristRotation() {
        return wristRotation;
    }
}
