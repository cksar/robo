package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.util.ElbowContraction;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ArmsControllerTest {
    private ArmsController armsControllerTest = new ArmsController();

    @Test
    public void elbowContractionLeftGetTest() {
        ElbowContraction elbowContractionLeft = armsControllerTest.elbowContractionLeft();
        Assert.assertEquals(ElbowContraction.REST, elbowContractionLeft);
    }

    @Test
    public void elbowContractionLeftPutTest() {
        ElbowContraction elbowContractionLeft = armsControllerTest.elbowContractionLeft(ElbowContraction.CONTRACTED);
        Assert.assertEquals(ElbowContraction.SLIGHTLY_CONTRACTED, elbowContractionLeft);
    }

    @Test
    public void wristRotationLeftGetTest() {
        int wristRotationLeft = armsControllerTest.wristRotationLeft();
        Assert.assertEquals(0, wristRotationLeft);
    }

    @Test
    public void wristRotationLeftPutTest() {
        int wristRotationLeft = armsControllerTest.wristRotationLeft(1);
        Assert.assertEquals(0, wristRotationLeft);
    }

    @Test
    public void elbowContractionRightGetTest() {
        armsControllerTest.elbowContractionRight(ElbowContraction.CONTRACTED);
        ElbowContraction elbowContractionRight = armsControllerTest.elbowContractionRight();
        Assert.assertEquals(ElbowContraction.SLIGHTLY_CONTRACTED, elbowContractionRight);
    }

    @Test
    public void elbowContractionRightPutTest() {
        armsControllerTest.elbowContractionRight(ElbowContraction.CONTRACTED);
        ElbowContraction elbowContractionRight = armsControllerTest.elbowContractionRight(ElbowContraction.CONTRACTED);
        Assert.assertEquals(ElbowContraction.CONTRACTED, elbowContractionRight);
    }

    @Test
    public void wristRotationRightGetTest() {
        for (int i = 0; i < 3; i++) {
            armsControllerTest.elbowContractionRight(ElbowContraction.CONTRACTED);
        }
        armsControllerTest.wristRotationRight(1);
        int wristRotationRight = armsControllerTest.wristRotationRight();
        Assert.assertEquals(45, wristRotationRight);
    }

    @Test
    public void wristRotationRightPutTest() {
        for (int i = 0; i < 3; i++) {
            armsControllerTest.elbowContractionRight(ElbowContraction.CONTRACTED);
        }
        int wristRotationRight = armsControllerTest.wristRotationRight(-1);
        Assert.assertEquals(-45, wristRotationRight);
    }
}
