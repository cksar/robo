package br.com.ndd.cesar.robo.models;

/*
 * @Author	Cesar Henrique
*/
public class Head {
    private HeadInclination headInclination;
    private int rotation;

    public Head() {
        this.rotation = 0;
        this.headInclination = headInclination.REST;
    }

    public Head(HeadInclination headInclination, int rotation) {
        this.rotation = 0;
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

    public int updateHeadRotation(int value) {
        if (getHeadInclination()!=HeadInclination.DOWN) {
            if ((value == 1)&&(this.rotation<90)) {
                this.rotation = this.rotation + 45;
            } else if ((value == -1)&&(rotation>-90)) {
                this.rotation = rotation - 45;
            } else if (value == 0){
                this.rotation = 0;
            }
        }
        return this.rotation;
    }

    public int getRotation() {
        return rotation;
    }
}
