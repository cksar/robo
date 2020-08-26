package br.com.ndd.cesar.robo.models;

public class Arms {
    private int wristRotation;
    private Elbow elbow;

    public Arms() {
        this.wristRotation = 0;
        this.elbow = Elbow.REST;
    }

    public Arms(int wristRotation, Elbow elbow) {
        this.wristRotation = 0;
        this.elbow = Elbow.REST;
    }

    public Elbow updateElbow(Elbow value) {
        if ((value == Elbow.REST) || (value == Elbow.CONTRACTED)) {
            switch (elbow) {
                case REST: {
                    if (value == Elbow.REST) {
                        this.elbow = Elbow.REST;
                    } else if (value == Elbow.CONTRACTED) {
                        this.elbow = Elbow.SLIGHTLY_CONTRACTED;
                    }
                    break;
                }
                case SLIGHTLY_CONTRACTED: {
                    if (value == Elbow.REST) {
                        this.elbow = Elbow.REST;
                    } else if (value == Elbow.CONTRACTED) {
                        this.elbow = Elbow.CONTRACTED;
                    }
                    break;
                }
                case CONTRACTED: {
                    if (value == Elbow.REST) {
                        this.elbow = Elbow.SLIGHTLY_CONTRACTED;
                    } else if (value == Elbow.CONTRACTED) {
                        this.elbow = Elbow.STRONGLY_CONTRACTED;
                    }
                    break;
                }
                case STRONGLY_CONTRACTED: {
                    if (value == Elbow.REST) {
                        this.elbow = Elbow.CONTRACTED;
                    } else if (value == Elbow.CONTRACTED) {
                        this.elbow = Elbow.STRONGLY_CONTRACTED;
                    }
                    break;
                }
            }
        }
        return elbow;
    }

    public Elbow getElbow() {
        return elbow;
    }
}
