package nu.larsson.stefan.test.sckrd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    @Test
    public void testIt() {
        Assert.assertTrue("Just a test to show KubernetesClient bean unavailable", true);
    }
}
