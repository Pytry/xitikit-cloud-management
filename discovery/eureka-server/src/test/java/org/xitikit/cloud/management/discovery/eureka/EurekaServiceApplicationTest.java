package org.xitikit.cloud.management.discovery.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by hoke1314 on 3/30/2017.
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = EurekaServiceApplication.class)
public class EurekaServiceApplicationTest {

    @Test
    public void load(){

    }
}