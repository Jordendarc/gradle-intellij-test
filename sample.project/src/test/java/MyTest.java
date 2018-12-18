import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyTest {
    @Test
    public void name() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        HelloWorld.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals("Hello", s);
    }
    @Test
    public void jordenTest() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int number = JordensClass.funFunction(10);
        Assert.assertEquals(0, number);
    }
}
