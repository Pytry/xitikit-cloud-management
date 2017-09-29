package test.xitikit.cloud.management.monitoring.pamyu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xitikit.cloud.management.monitoring.pamyu.PamyuApplication;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
    webEnvironment = RANDOM_PORT,
    classes = PamyuApplication.class
)
public class PamyuApplicationTest{

    @Test
    public void load() throws Exception{

    }
}