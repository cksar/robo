package br.com.ndd.cesar.robo.models;

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
public class ArmsTest {

    private Arms armsTest = new Arms();

    @Test
    public void updateElbowContractionTest() {
        ElbowContraction elbowContraction = armsTest.updateElbowContraction(ElbowContraction.CONTRACTED);
        Assert.assertEquals(ElbowContraction.SLIGHTLY_CONTRACTED, elbowContraction);
    }

    @Test
    public void updateWristRotationTest() {
        int wristRotation = armsTest.updateWristRotation(-1);
        Assert.assertEquals(0, wristRotation);
    }
}
