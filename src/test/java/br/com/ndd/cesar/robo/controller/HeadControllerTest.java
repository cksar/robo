package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.models.ElbowContraction;
import br.com.ndd.cesar.robo.models.HeadInclination;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class HeadControllerTest {
    private HeadController headControllerTest = new HeadController();

    @Test
    public void HeadInclinationGetTest() {
        HeadInclination headInclination = headControllerTest.HeadInclination();
        Assert.assertEquals(HeadInclination.REST, headInclination);
    }

    @Test
    public void HeadInclinationPutTest() {
        HeadInclination headInclination = headControllerTest.HeadInclination(HeadInclination.UP);
        Assert.assertEquals(HeadInclination.UP, headInclination);
    }

    @Test
    public void headRotationGetTest() {
        int headRotation = headControllerTest.headRotation();
        Assert.assertEquals(0, headRotation);
    }

    @Test
    public void headRotationPutTest() {
        int headRotation = headControllerTest.headRotation(1);
        Assert.assertEquals(45, headRotation);
    }
}
