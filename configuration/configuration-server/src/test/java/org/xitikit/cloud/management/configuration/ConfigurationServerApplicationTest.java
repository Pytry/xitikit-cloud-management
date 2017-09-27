package org.xitikit.cloud.management.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hoke1314 on 3/30/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = ConfigurationServerApplication.class)
public class ConfigurationServerApplicationTest{

    @Test
    public void load(){

    }
}