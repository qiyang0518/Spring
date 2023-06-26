package org.example;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class DemoTest
{
    @Test
    public void testSay()
    {
        Demo demo = new Demo();
        String say = demo.say("Hello World");
        Assert.assertEquals("helloHello World",say);
    }
}
