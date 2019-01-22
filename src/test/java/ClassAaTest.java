import org.junit.Assert;
import org.junit.Test;

public class ClassAaTest {

    ClassA classA = new ClassA();

    @Test
    public void foo() {
        Assert.assertTrue("test msg",classA.foo("str").length() > 0);
    }


    @Test
    public void bar() {
        Assert.assertNull(classA.bar("ss"));
    }
}