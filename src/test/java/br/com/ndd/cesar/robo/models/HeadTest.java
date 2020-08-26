package br.com.ndd.cesar.robo.models;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class HeadTest {

    private Head headTest = new Head();

    @Test
    public void updateHeadInclinationTest() {
        HeadInclination headInclination = headTest.updateHeadInclination(HeadInclination.UP);
        Assert.assertEquals(HeadInclination.UP, headInclination);
    }

    @Test
    public void updateHeadRotationTest() {
        int headRotation = headTest.updateHeadRotation(1);
        Assert.assertEquals(45, headRotation);
    }

}
