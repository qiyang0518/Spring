package org.example;
import org.junit.Test;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Orders
{
    private String oName;
    private String address;

    public Orders(String oName,String address)
    {
        this.oName = oName;
        this.address = address;
    }

    @Test
    public void ordersTest()
    {
        System.out.println(oName + "\t" + address);
    }
}
