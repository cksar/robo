package br.com.ndd.cesar.robo.models;

/*
 * @Author	Cesar Henrique
*/
public class Head {
    private HeadInclination headInclination;

    public Head() {
        this.headInclination = headInclination.REST;
    }

    public Head(HeadInclination headInclination) {
        this.headInclination = headInclination.REST;
    }

    public HeadInclination getHeadInclination() {
        return headInclination;
    }

    public HeadInclination updateHeadInclination(HeadInclination value) {
        if ((value == HeadInclination.DOWN) || (value == HeadInclination.UP)) {
            switch (headInclination) {
                case REST: {
                    if (value == HeadInclination.DOWN) {
                        this.headInclination = HeadInclination.DOWN;
                    } else if (value == HeadInclination.UP) {
                        this.headInclination = HeadInclination.UP;
                    }
                    break;
                }
                case UP: {
                    if (value == HeadInclination.DOWN) {
                        this.headInclination = HeadInclination.REST;
                    } else if (value == HeadInclination.UP) {
                        this.headInclination = HeadInclination.UP;
                    }
                    break;
                }
                case DOWN: {
                    if (value == HeadInclination.DOWN) {
                        this.headInclination = HeadInclination.DOWN;
                    } else if (value == HeadInclination.UP) {
                        this.headInclination = HeadInclination.REST;
                    }
                    break;
                }
            }
        }
        return headInclination;
    }
}
