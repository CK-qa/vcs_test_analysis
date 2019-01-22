import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassATest {

    ClassA classA = new ClassA();

    @Test
    public void foo() {
        Assert.assertTrue("test msg",classA.foo("str").length() > 0);
    }
}